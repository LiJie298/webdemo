package com.example.webdemo.controller;

import com.example.webdemo.entity.User;
import com.example.webdemo.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
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

    private static final String PASSWORD_KEY = "ifeng";

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String userLogin(Map<String, Object> map, @RequestParam String username, @RequestParam String password, HttpSession session, HttpServletResponse response) throws IOException {
        String pas = DigestUtils.md5Hex(password + PASSWORD_KEY);
        User user = userService.getUser(username);
        if (user != null && pas.equals(user.getPassword())) {
            session.setAttribute("user", user);
            response.sendRedirect("/index");
            return "";
        } else {
            String errorMes = user == null ? "用户不存在" : "用户名或密码错误";
            map.put("code", 0);
            map.put("errorMes", errorMes);
            return "login";
        }
    }
}
