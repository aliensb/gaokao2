package ku6.tv.gaokao.business.search.controller;

import ku6.tv.gaokao.business.search.service.SearchService;
import ku6.tv.gaokao.model.vo.GradeSearchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class SearchController {
    @Autowired
    private SearchService searchService;
    @PostMapping("/search")
    public String search(Model model, HttpSession session, GradeSearchVo gradeSearchVo) {

        session.setAttribute("gradeSearchVo",gradeSearchVo);
        model.addAttribute("page",searchService.search(gradeSearchVo,1));
        return "search";
    }
    @GetMapping("/search/{pageNo}")
    public String searchPage(Model model, HttpSession session,
                             @PathVariable(name = "pageNo",required = true)Integer pageNo){
        GradeSearchVo gradeSearchVo= (GradeSearchVo) session.getAttribute("gradeSearchVo");
        if(gradeSearchVo==null){
            return "redirect:/";
        }
        model.addAttribute("page",searchService.search(gradeSearchVo,pageNo));
        return "search";
    }
}
