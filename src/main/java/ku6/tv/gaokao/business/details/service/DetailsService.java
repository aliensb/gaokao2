package ku6.tv.gaokao.business.details.service;

import ku6.tv.gaokao.mapper.XuexiaoMapper;
import ku6.tv.gaokao.mapper.ZhuanyeMapper;
import ku6.tv.gaokao.model.Xuexiao;
import ku6.tv.gaokao.model.Zhuanye;
import ku6.tv.gaokao.model.ZhuanyeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsService {
    @Autowired
    private ZhuanyeMapper zhuanyeMapper;
    @Autowired
    private XuexiaoMapper xuexiaoMapper;

    public List<Zhuanye> getZhuanyeBySid(Integer sid){
        ZhuanyeExample zhuanyeExample=new ZhuanyeExample();
        zhuanyeExample.createCriteria().andXuexiaoidEqualTo(sid);
        return zhuanyeMapper.selectByExample(zhuanyeExample);
    }

    public Xuexiao getXuexiaoById(Integer sid){
        return xuexiaoMapper.selectByPrimaryKey(sid);
    }
}
