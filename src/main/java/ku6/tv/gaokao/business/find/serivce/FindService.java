package ku6.tv.gaokao.business.find.serivce;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import ku6.tv.gaokao.constants.MVCConstant;
import ku6.tv.gaokao.mapper.XuexiaoMapper;
import ku6.tv.gaokao.mapper.ZhuanyeMapper;

import ku6.tv.gaokao.model.Xuexiao;
import ku6.tv.gaokao.model.Zhuanye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindService {
    @Autowired
    private ZhuanyeMapper zhuanyeMapper;

    @Autowired
    private XuexiaoMapper xuexiaoMapper;

    public PageInfo findByZhuanyName(String schoolName,Integer pageNo){
        PageHelper.startPage(pageNo, MVCConstant.PAGE_SIZE);
        List<Zhuanye> xuexiaoList=zhuanyeMapper.findByZhuanyeLike(schoolName);
        return new PageInfo(xuexiaoList);
    }

    public PageInfo findBySchoolName(String schoolName,Integer pageNo){
        PageHelper.startPage(pageNo, MVCConstant.PAGE_SIZE);
        List<Xuexiao> xuexiaoList=xuexiaoMapper.findByNameLike(schoolName);
        return new PageInfo(xuexiaoList);
    }
}
