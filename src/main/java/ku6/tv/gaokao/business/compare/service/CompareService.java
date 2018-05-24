package ku6.tv.gaokao.business.compare.service;

import ku6.tv.gaokao.mapper.XuexiaoMapper;
import ku6.tv.gaokao.mapper.ZhuanyeMapper;
import ku6.tv.gaokao.model.XueXiaoAndZhuanye;
import ku6.tv.gaokao.model.Xuexiao;
import ku6.tv.gaokao.model.Zhuanye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompareService {
    @Autowired
    private XuexiaoMapper xuexiaoMapper;

    @Autowired
    private ZhuanyeMapper zhuanyeMapper;
    public List<Xuexiao> getXuexiaosInCookies(Cookie[] cookies){
        List<Integer> schoolIds=this.getSchoolIdFromCookies(cookies);
        List<Xuexiao> xuexiaoList=xuexiaoMapper.findSchoolInIds(schoolIds);
        return xuexiaoList;
    }

    public List<XueXiaoAndZhuanye> getXuexiaoAndZhuanyeFromCookies(Cookie[] cookies){
        List<Integer> schoolIds=this.getSchoolIdFromCookies(cookies);
        List<XueXiaoAndZhuanye> zhuanyes=xuexiaoMapper.selectXueXiaoAndZhuanInXuexiaoId(schoolIds);
        return zhuanyes;
    }

    public Map<Integer,Xuexiao> converListXuexiaoToMap(List<Xuexiao> xuexiaoList){
        Map<Integer,Xuexiao> map=new HashMap<>();
        for(Xuexiao xuexiao:xuexiaoList){
            map.put(xuexiao.getId(),xuexiao);
        }
        return map;
    }


    public Zhuanye getZhuanyeById(Integer id){
        return zhuanyeMapper.selectByPrimaryKey(id);
    }
    private List<Integer> getSchoolIdFromCookies(Cookie [] cookies){
        String cookieStr="";
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("schoolName")){
                cookieStr=cookie.getValue();
            }
        }
        if(cookieStr.equals("")){
            return null;
        }
        String str= URLDecoder.decode(cookieStr);
        String[] schools=str.split(",");
        List<Integer> schoolIds=new ArrayList<>();
        for(String sch :schools){
            schoolIds.add(new Integer(sch.split("-")[0]));
        }
        return schoolIds;
    }
}
