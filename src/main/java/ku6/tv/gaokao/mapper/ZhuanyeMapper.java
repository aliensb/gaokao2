package ku6.tv.gaokao.mapper;

import java.util.List;
import ku6.tv.gaokao.model.Zhuanye;
import ku6.tv.gaokao.model.ZhuanyeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ZhuanyeMapper {
    long countByExample(ZhuanyeExample example);

    int deleteByExample(ZhuanyeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zhuanye record);

    int insertSelective(Zhuanye record);

    List<Zhuanye> selectByExample(ZhuanyeExample example);

    Zhuanye selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zhuanye record, @Param("example") ZhuanyeExample example);

    int updateByExample(@Param("record") Zhuanye record, @Param("example") ZhuanyeExample example);

    int updateByPrimaryKeySelective(Zhuanye record);

    int updateByPrimaryKey(Zhuanye record);

    List<Zhuanye> findByZhuanyeLike(String zhuanye);
}