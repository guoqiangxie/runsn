package com.runsn.controller;

import com.runsn.dto.Engineer;
import com.runsn.jdbc.EngineerDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: ErrorController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class StarController {

    @RequestMapping("star.html")
    public ModelAndView star(ModelAndView model) {
        List<Engineer> engineers = EngineerDao.queryAll();
        List<Engineer> result = new ArrayList<Engineer>();
        for (Engineer engineer : engineers) {
            if ("on".equals(engineer.getStar())) {
                result.add(engineer);
            }
        }
        model.addObject("starEngineers", result);
        model.setViewName("/star");
        return model;
    }
}
