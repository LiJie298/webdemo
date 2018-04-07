package com.example.webdemo.controller;

import com.example.webdemo.entity.User;
import com.example.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 22:50
 * Description:
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/loginVerify", method = RequestMethod.POST)
    public String userLogin(Map<String, Object> map, @RequestParam String userName, @RequestParam String password, HttpSession session) {
        User user = userService.getUser(userName, password);
        if (user != null && password.equals(user.getPassWord())) {

        }else {
            String errorMes = user==null?"用户不存在":"用户名或密码错误";
            map.put("error",errorMes);
        }
        return "login";

    }
}
