package ku6.tv.gaokao.business.index.contoller;


import ku6.tv.gaokao.business.index.service.IndexService;
import ku6.tv.gaokao.constants.MVCConstant;
import ku6.tv.gaokao.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    private IndexService indexService;

    @RequestMapping(value = {"/show/{pageNo}","/","/show"})
    public String show(Model model, @PathVariable(value = "pageNo",required = false) Integer pageNo){
        if(pageNo==null){
           pageNo=1;
        }
        model.addAttribute("page",indexService.getXuexiao(pageNo));
        return "index";
    }


}
