package com.example.webdemo.dao;

import com.example.webdemo.entity.Page;

import java.util.List;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 14:05
 * Description:
 */
public interface PageListDao {
    List<Page> getAllPageList(String userId);

    void insertPageList(Page page);
}
