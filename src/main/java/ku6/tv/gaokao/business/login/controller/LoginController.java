package ku6.tv.gaokao.business.login.controller;

import ku6.tv.gaokao.constants.MVCConstant;
import ku6.tv.gaokao.mapper.StudentMapper;
import ku6.tv.gaokao.mapper.TeacherMapper;
import ku6.tv.gaokao.model.Student;
import ku6.tv.gaokao.model.StudentExample;
import ku6.tv.gaokao.model.Teacher;
import ku6.tv.gaokao.model.vo.LoginVo;
import ku6.tv.gaokao.model.TeacherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, HttpSession session, @Validated LoginVo loginVo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("error", bindingResult.getAllErrors().get(0).getDefaultMessage());
            model.addAttribute("loginVo", loginVo);
            return "login";
        } else {
            TeacherExample example = new TeacherExample();
            example.createCriteria().andNameEqualTo(loginVo.getTeacher()).andSecretEqualTo(loginVo.getSecret());
            List<Teacher> teacherList = teacherMapper.selectByExample(example);
            if (teacherList.size() != 1) {
                model.addAttribute("error", MVCConstant.NO_TEACHER_EXITST);
                model.addAttribute("loginVo", loginVo);
                return "login";
            } else {
                Teacher teacher = teacherList.get(0);
                Student student = null;
                StudentExample studentExample = new StudentExample();
                studentExample.createCriteria().andIdnoEqualTo(loginVo.getStIdno())
                        .andStuNameEqualTo(loginVo.getStName());
                List<Student> studentList = studentMapper.selectByExample(studentExample);
                Integer stId = 0;
                if (studentList.size() >= 1) {
                    student = studentList.get(0);
                    //不能修改成绩，修改成绩会导致无法管理机构填报了多少个学生
                    //student.setFenshu(loginVo.getStGrade());
                    if(student.getStatus().compareTo(1)==0){
                        //已经缴费了
                    }
                    stId = student.getId();
                    session.setAttribute(MVCConstant.CURRENT_STUDENT_ID, stId);
                    session.setAttribute(MVCConstant.TEACHER, loginVo);
                    studentMapper.updateByPrimaryKey(student);
                } else {
                    student = new Student();
                    student.setIdno(loginVo.getStIdno());
                    student.setTid(teacher.getId());
                    student.setStuName(loginVo.getStName());
                    student.setFenshu(loginVo.getStGrade());
                    student.setGid(teacher.getGid());
                    student.setStatus(0);
                    studentMapper.insert(student);
                    stId=student.getId();
                    session.setAttribute(MVCConstant.CURRENT_STUDENT_ID, stId);
                    session.setAttribute(MVCConstant.TEACHER, loginVo);
                }
                model.addAttribute("stInfo", student);
                model.addAttribute("stid", stId);
                return "wait";
            }
        }
    }
    @ResponseBody
    @PostMapping("/checkFee")
    public int checkFee(HttpSession session,Integer stid){
        Integer stidInSession= (Integer) session.getAttribute(MVCConstant.CURRENT_STUDENT_ID);
        if (stidInSession.compareTo(stid)==0){
            Student student=studentMapper.selectByPrimaryKey(stid);
            session.setAttribute(MVCConstant.CURRENT_STUDENT,student);
            return student.getStatus();
        }
        return 0;
    }
}
