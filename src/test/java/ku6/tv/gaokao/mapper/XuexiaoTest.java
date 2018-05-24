package ku6.tv.gaokao.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import ku6.tv.gaokao.business.search.service.SearchService;
import ku6.tv.gaokao.model.XueXiaoAndZhuanye;
import ku6.tv.gaokao.model.Xuexiao;
import ku6.tv.gaokao.model.vo.GradeSearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XuexiaoTest {
    @Autowired
    private XuexiaoMapper xuexiaoMapper;
    @Test
    public void testInsert() throws Exception {
        List<String> names=xuexiaoMapper.getProvinceNames();
        for (String name:names)
            System.out.println(name);
    }
    @Test
    public void testCityNames(){
        List<String> names=xuexiaoMapper.getCityNamesByProvinceName("辽宁");
        for (String name:names)
            System.out.println("<option value='"+name+"'>"+name+"</option>");
    }
//    @Test
//    public void testGetBanXue(){
//        List<String> names=xuexiaoMapper.getBanXue();
//        for (String name:names)
//            System.out.println("<option value='"+name+"'>"+name+"</option>");
//    }
    @Test
    public void testPageHelper(){
        // startPage(第几页, 多少条数据)
        PageHelper.startPage(1, 100);
// Mybatis查询方法
        List<Xuexiao> list = xuexiaoMapper.selectAll();
//// 用PageInfo对结果进行包装
        PageInfo pageInfo = new PageInfo(list);
    }

    @Test
    public void testSearch(){
        GradeSearchVo gradeSearchVo=new GradeSearchVo();
        gradeSearchVo.setGrade(521d);
        gradeSearchVo.setBodongzhi(100d);
//        gradeSearchVo.setProvince("四川");
//        gradeSearchVo.setCity("成都市");
        gradeSearchVo.setWenli("文科");
        gradeSearchVo.setPici("本科二批");
//        gradeSearchVo.setBanxue("公办");
        List<Xuexiao> xuexiaos=xuexiaoMapper.search(gradeSearchVo);
        for(Xuexiao xuexiao:xuexiaos){
            System.out.println(xuexiao);
        }
    }
    @Autowired
    private SearchService searchService;
    @Test
    public void testSearchWithPage(){
        GradeSearchVo gradeSearchVo=new GradeSearchVo();
        gradeSearchVo.setGrade(521d);
        gradeSearchVo.setBodongzhi(100d);
//        gradeSearchVo.setProvince("四川");
//        gradeSearchVo.setCity("成都市");
        gradeSearchVo.setWenli("文科");
        gradeSearchVo.setPici("本科二批");
        gradeSearchVo.setSort(1);
//        gradeSearchVo.setBanxue("公办");
        PageInfo<Xuexiao> pageInfo=searchService.search(gradeSearchVo,3);
        for(Xuexiao xuexiao:pageInfo.getList()){
            System.out.println(xuexiao.getYucefenshu2018());
        }

    }
    @Test
    public void testFindByNameLike(){
        for(Xuexiao xuexiao:xuexiaoMapper.findByNameLike("锦城")){
            System.out.println(xuexiao);
        }
    }
    @Test
    public void testInIds(){
        List<Integer> ids=new ArrayList<>();
        ids.add(11659);
        ids.add(11658);
        ids.add(11660);
        ids.add(11669);
        ids.add(11653);
        ids.add(11651);
        for(Xuexiao xuexiao:xuexiaoMapper.findSchoolInIds(ids)){
            System.out.println(xuexiao);
        }
    }
    @Test
    public void testInIdsde(){
        List<Integer> ids=new ArrayList<>();
        ids.add(14164);

        for(XueXiaoAndZhuanye xuexiao:xuexiaoMapper.selectXueXiaoAndZhuanInXuexiaoId(ids)){
            System.out.println(xuexiao);
        }
    }

}
