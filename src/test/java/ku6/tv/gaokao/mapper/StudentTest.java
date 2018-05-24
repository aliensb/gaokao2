package ku6.tv.gaokao.mapper;

import ku6.tv.gaokao.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void testInsert() throws Exception {
        Student student=new Student();
        student.setFenshu(10.1);
        student.setStuName("tom");
        student.setTid(101);
        student.setIdno("510681199513122145");
        int id=studentMapper.insert(student);
        System.out.println(student.getId());
    }

}
