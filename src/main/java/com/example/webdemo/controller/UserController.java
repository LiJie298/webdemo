package com.example.webdemo.controller;

import com.example.webdemo.entity.User;
import com.example.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @author lijie
 * @date 2018/04/06
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    //map(String,Object),前面一个String是在模板中调用时的参数名，后面是实际的参数;
    @RequestMapping("/user")
    public String getConsumeInfo(Map<String, Object> map) {
        List<User> users = userService.getAllUser();
        map.put("users", users);
        return "user";
    }


    @RequestMapping(value="/i1ndex",method= RequestMethod.GET)
    public String index(Map<String, Object> map){
        return "i1ndex";
    }
}
