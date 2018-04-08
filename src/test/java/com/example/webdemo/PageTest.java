package com.example.webdemo;

import com.example.webdemo.entity.Page;
import com.example.webdemo.service.PageListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 16:27
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PageTest {
    @Autowired
    private PageListService pageListService;

    @Test
    public void insetPage(){
        Page  page = new Page();
        page.setUserId("6746");
        page.setParentId(0);
        page.setName("微信模块");
        page.setChildId(01);
        page.setSort(2);
        Page  page1 = new Page();
        page1.setUserId("6746");
        page1.setParentId(0);
        page1.setName("稿源模块");
        page.setChildId(02);
        page1.setSort(3);
        Page  page2 = new Page();
        page2.setUserId("6746");
        page2.setParentId(0);
        page2.setChildId(03);
        page2.setName("头条模块");
        page2.setSort(4);
        Page  page3 = new Page();
        page3.setUserId("6746");
        page.setChildId(04);
        page3.setParentId(0);
        page3.setName("微信模块");
        page3.setSort(5);
        List<Page> pageList = new ArrayList<>();
        pageList.add(page);
        pageList.add(page1);
        pageList.add(page2);
        pageList.add(page3);
//        template.insertAll(pageList);
    }

    @Test
    public void getIndexPage(){
        int userId = 6746;
        List<Page> pages = pageListService.getIndexPageItem(userId);

    }
}
