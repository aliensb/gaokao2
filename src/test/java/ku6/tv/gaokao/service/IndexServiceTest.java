package ku6.tv.gaokao.service;

import ku6.tv.gaokao.business.index.service.IndexService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IndexServiceTest {
    @Autowired
    private IndexService indexService;
    @Test
    public void test(){
        indexService.getXuexiao(1);
    }
}
