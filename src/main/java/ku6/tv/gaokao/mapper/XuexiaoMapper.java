package ku6.tv.gaokao.mapper;

import java.util.List;

import ku6.tv.gaokao.model.XueXiaoAndZhuanye;
import ku6.tv.gaokao.model.Xuexiao;
import ku6.tv.gaokao.model.XuexiaoExample;
import ku6.tv.gaokao.model.vo.GradeSearchVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface XuexiaoMapper {
    long countByExample(XuexiaoExample example);

    int deleteByExample(XuexiaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xuexiao record);

    int insertSelective(Xuexiao record);

    List<Xuexiao> selectByExample(XuexiaoExample example);

    Xuexiao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xuexiao record, @Param("example") XuexiaoExample example);

    int updateByExample(@Param("record") Xuexiao record, @Param("example") XuexiaoExample example);

    int updateByPrimaryKeySelective(Xuexiao record);

    int updateByPrimaryKey(Xuexiao record);

    List<String> getProvinceNames();

    List<String> getCityNamesByProvinceName(String proName);

    List<Xuexiao> selectAll();

    List<Xuexiao> search(GradeSearchVo gradeSearchVo);

    List<Xuexiao> findByNameLike(String schoolName);

    List<Xuexiao> findSchoolInIds(List<Integer> ids);


    List<XueXiaoAndZhuanye> selectXueXiaoAndZhuanInXuexiaoId(List<Integer> ids);
//
//    List<XueXiaoAndZhuanye> selectXueXiaoAndZhuanyeByXuexiaoIds(List<Integer> ids);
}