package ku6.tv.gaokao.business.resource.service;

import ku6.tv.gaokao.mapper.XuexiaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResService {
    @Autowired
    private XuexiaoMapper xuexiaoMapper;
    public List<String> getProNames(){
        return xuexiaoMapper.getProvinceNames();
    }

    public  List<String> getCityNamesByPro(String proName){
        return xuexiaoMapper.getCityNamesByProvinceName(proName);
    }

}
