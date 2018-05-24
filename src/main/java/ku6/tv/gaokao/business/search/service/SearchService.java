package ku6.tv.gaokao.business.search.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import ku6.tv.gaokao.constants.MVCConstant;
import ku6.tv.gaokao.mapper.XuexiaoMapper;
import ku6.tv.gaokao.model.Xuexiao;
import ku6.tv.gaokao.model.vo.GradeSearchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchService {
    @Autowired
    private XuexiaoMapper xuexiaoMapper;

    public PageInfo search(GradeSearchVo gradeSearchVo,Integer pageNo) {
        PageHelper.startPage(pageNo, MVCConstant.PAGE_SIZE);
        List<Xuexiao> xuexiaoList=xuexiaoMapper.search(gradeSearchVo);
        return new PageInfo(xuexiaoList);
    }
}
