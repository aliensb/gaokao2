package ku6.tv.gaokao.mapper;

import ku6.tv.gaokao.model.TeacherExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherTest {
    @Autowired
    private TeacherMapper teacherMapper;
    @Test
    public void test(){
        TeacherExample example=new TeacherExample();
        example.createCriteria().andNameEqualTo("jack1").andSecretEqualTo("110120119");
        long count=teacherMapper.countByExample(example);
        System.out.println(count);
    }
}
