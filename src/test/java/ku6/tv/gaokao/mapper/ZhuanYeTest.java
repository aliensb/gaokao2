package ku6.tv.gaokao.mapper;

import ku6.tv.gaokao.model.Zhuanye;
import ku6.tv.gaokao.model.ZhuanyeExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZhuanYeTest {
    @Autowired
    private ZhuanyeMapper zhuanyeMapper;
    @Test
    public void test(){
        ZhuanyeExample example=new ZhuanyeExample();
        example.createCriteria().andXuexiaoidEqualTo(11651);
        List<Zhuanye> zhuanyes=zhuanyeMapper.selectByExample(example);
        for(Zhuanye zhuanye:zhuanyes){
            System.out.println(zhuanye);
        }
    }
}
