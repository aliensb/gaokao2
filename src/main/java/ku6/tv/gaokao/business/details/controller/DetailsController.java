package ku6.tv.gaokao.business.details.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ku6.tv.gaokao.business.details.service.DetailsService;
@Controller
public class DetailsController {
    @Autowired
    private DetailsService detailsService;
    @GetMapping("/details/{sid}")
    public String details(Model model, @PathVariable(name = "sid",required = true) Integer sid){
        model.addAttribute("zhuanyes",detailsService.getZhuanyeBySid(sid));
        model.addAttribute("xuexiao",detailsService.getXuexiaoById(sid));
        return "details";
    }
}
