package com.example.webdemo.entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 14:00
 * Description:
 */
public class Page {
    private ObjectId id;
    private int parentId;
    private int currentId;
    private int childId;
    private String userId;
    private String name;
    private int sort;
    private List<Page> page;

    public Page() {
    }

    public ObjectId getId() {
        return id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", currentId=" + currentId +
                ", childId=" + childId +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                '}';
    }
}
