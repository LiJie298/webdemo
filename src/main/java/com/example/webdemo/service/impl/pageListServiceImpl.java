package com.example.webdemo.service.impl;

import com.example.webdemo.dao.PageListDao;
import com.example.webdemo.entity.Page;
import com.example.webdemo.service.PageListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 13:59
 * Description:
 */
@Service
public class pageListServiceImpl implements PageListService {
    @Autowired
    private PageListDao pageListDao;
    @Override
    public List<Page> getIndexPageItem(String userId) {
        return pageListDao.getAllPageList(userId);
    }
}
