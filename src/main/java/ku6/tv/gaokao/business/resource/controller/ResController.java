package ku6.tv.gaokao.business.resource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ku6.tv.gaokao.business.resource.service.ResService;

import java.util.List;

@RestController
@RequestMapping("/res/")
public class ResController {
    @Autowired
    private ResService addService;
    @GetMapping("getProNames")
    public List<String> getProNames(){
        return addService.getProNames();
    }

    @PostMapping("getCityByPro")
    public List<String> getCityByPro(String proName){
        return addService.getCityNamesByPro(proName);
    }
}
