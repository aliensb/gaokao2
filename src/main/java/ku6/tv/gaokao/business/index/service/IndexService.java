package ku6.tv.gaokao.business.index.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import ku6.tv.gaokao.constants.MVCConstant;

import ku6.tv.gaokao.mapper.XuexiaoMapper;

import ku6.tv.gaokao.model.Xuexiao;
import ku6.tv.gaokao.model.XuexiaoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {
    @Autowired
    private XuexiaoMapper xuexiaoMapper;

    public PageInfo getXuexiao(Integer pageNo){
        PageHelper.startPage(pageNo, MVCConstant.PAGE_SIZE);
        XuexiaoExample example=new XuexiaoExample();
        example.setOrderByClause("yucefenshu2018 desc");
        List<Xuexiao> list = xuexiaoMapper.selectAll();
        return new PageInfo(list);
    }

}
