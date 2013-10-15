package com.runsn.controller;

import com.runsn.dto.User;
import com.runsn.jdbc.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Title: LoginController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class LoginController {

    @RequestMapping("login")
         public String login() {
        return "login";
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request) {
        request.getSession().setAttribute("isLogin", null);
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public String submit(@RequestBody String value, HttpServletRequest request) {
        Map user = stringToMap(value);
        User dbUser = UserDao.query((String) user.get("name"));
        if (dbUser.getId() != null && dbUser.getPassword().equals(user.get("password"))) {
            request.getSession().setAttribute("isLogin", Boolean.TRUE);
            return "T";
        } else return "F";
    }

    public Map stringToMap(String value) {
        String[] objects = value.split("&");
        Map result = new HashMap();
        for (String str : objects) {
            String[] obj = str.split("=");
            result.put(obj[0], obj[1]);
        }
        return result;
    }

}
