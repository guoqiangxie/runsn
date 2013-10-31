package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Title: serviceController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class SolutionController {

    @RequestMapping("solution.html")
    public String solution() {
        return "solution";
    }

    @RequestMapping("solution_1.html")
    public String solution_1() {
        return "solution_1";
    }
}
