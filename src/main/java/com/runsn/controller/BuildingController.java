package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Title: BuildingController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class BuildingController {

    @RequestMapping("building.html")
    public String building() {
        return "building";
    }
}
