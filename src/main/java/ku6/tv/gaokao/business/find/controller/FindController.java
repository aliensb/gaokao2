package ku6.tv.gaokao.business.find.controller;

import ku6.tv.gaokao.business.find.serivce.FindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class FindController {
    @Autowired
    private FindService findService;

    /**
     * 专业名字查找
     * @param model
     * @param session
     * @param zhuanye
     * @return
     */
    @PostMapping("/zyfind")
    public String zyFind(Model model, HttpSession session,String zhuanye){
        session.setAttribute("zhuanyefind",zhuanye);
        model.addAttribute("page",findService.findByZhuanyName(zhuanye,1));
        return "zhuanyefind";
    }
    @GetMapping("/zyfind/{pageNo}")
    public String zyFindPage(Model model, HttpSession session,
                             @PathVariable(name = "pageNo",required = true)Integer pageNo){
        String zhuanyeName= (String) session.getAttribute("zhuanyefind");
        if(zhuanyeName==null){
            return "redirect:/";
        }
        model.addAttribute("page",findService.findByZhuanyName(zhuanyeName,pageNo));
        return "zhuanyefind";
    }

    /**
     *学校名称查找
     * @param model
     * @param session
     * @param xuexiao
     * @return
     */
    @PostMapping("/xxfind")
    public String xxFind(Model model, HttpSession session,String xuexiao){
        session.setAttribute("xuexiaofind",xuexiao);
        model.addAttribute("page",findService.findBySchoolName(xuexiao,1));
        return "xuexiaofind";
    }
    @GetMapping("/xxfind/{pageNo}")
    public String xxFindPage(Model model, HttpSession session,
                             @PathVariable(name = "pageNo",required = true)Integer pageNo){
        String zhuanyeName= (String) session.getAttribute("xuexiaofind");
        if(zhuanyeName==null){
            return "redirect:/";
        }
        model.addAttribute("page",findService.findBySchoolName(zhuanyeName,pageNo));
        return "xuexiaofind";
    }
}
