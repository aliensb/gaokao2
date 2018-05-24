package ku6.tv.gaokao.mapper;

import java.util.List;
import ku6.tv.gaokao.model.Group;
import ku6.tv.gaokao.model.GroupExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMapper {
    long countByExample(GroupExample example);

    int deleteByExample(GroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Group record);

    int insertSelective(Group record);

    List<Group> selectByExample(GroupExample example);

    Group selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByExample(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}