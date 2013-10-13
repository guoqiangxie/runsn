package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * Title: KindEditorController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class KindEditorController {
    @RequestMapping(value = "/upload_json", method = RequestMethod.POST)
    public String upload() {
        return "kindeditor/upload_json";
    }
}
