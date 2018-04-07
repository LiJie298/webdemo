package com.example.webdemo.service;

import com.example.webdemo.entity.Page;

import java.util.List;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 13:59
 * Description:
 */
public interface PageListService {
    List<Page> getIndexPageItem(String userId);
}
