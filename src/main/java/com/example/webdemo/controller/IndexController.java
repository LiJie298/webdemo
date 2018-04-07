package com.example.webdemo.controller;

import com.example.webdemo.entity.Page;
import com.example.webdemo.service.PageListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 16:22
 * Description:
 */
@Controller
public class IndexController {
    @Autowired
    private PageListService pageListService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Map<String, Object> map) {
        int userId = 6746;
        List<Page> pages = pageListService.getIndexPageItem(String.valueOf(userId));
        pages.forEach(System.out::print);
        map.put("pageList", pages);
        return "index";
    }
}
