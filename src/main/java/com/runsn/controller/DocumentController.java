package com.runsn.controller;

import com.runsn.jdbc.DocumentDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * Title: DocumentController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class DocumentController {
    @RequestMapping("submitDocument")
    public String submitDocument(@RequestParam("name") String name, @RequestParam("content") String content) {
        DocumentDao.save(name, content);
        return "redirect:show";
    }

//    @RequestMapping("show")
//    public ModelAndView show() {
//        ModelAndView mav = new ModelAndView("show");
//        String content = DocumentDao.query(2);
//        mav.addObject("content", content);
//        return mav;
//    }
}
