package ku6.tv.gaokao.business.compare.index;

import ku6.tv.gaokao.business.compare.service.CompareService;
import ku6.tv.gaokao.model.XueXiaoAndZhuanye;
import ku6.tv.gaokao.model.Xuexiao;
import ku6.tv.gaokao.model.Zhuanye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CompareController {

    @Autowired
    private CompareService compareService;

    @GetMapping("/com")
    public String  com(HttpServletRequest request, Model model){
        Cookie[] cookies = request.getCookies();
        List<XueXiaoAndZhuanye> xuexiaoList=compareService.getXuexiaoAndZhuanyeFromCookies(cookies);
        model.addAttribute("xuexiaos",xuexiaoList);
        return "compare";
    }

    @PostMapping("/com/zhuanye")
    @ResponseBody
    public Zhuanye getZhuanyeDetails(Integer id){
        return compareService.getZhuanyeById(id);
    }
}
