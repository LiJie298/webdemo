package com.example.webdemo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private int userId;
    private String userName;
    private String password;
    private String fullName;
    private String createTime;
    private String latestLoginTime;
    private String email;
    private String addUserName;
    private int role;
    private int videoRole;
    private int wechatRole;
    private int articleRole;
    private int wechatEmail;
    private int videoEmail;
    private int analysisEmail;
    private int weiboRole;

    public User() {
    }

    public User(int userId, String userName, String password, String fullName, String createTime, String latestLoginTime, String email, String addUserName, int role, int videoRole, int wechatRole, int articleRole, int wechatEmail, int videoEmail, int analysisEmail, int weiboRole) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.createTime = createTime;
        this.latestLoginTime = latestLoginTime;
        this.email = email;
        this.addUserName = addUserName;
        this.role = role;
        this.videoRole = videoRole;
        this.wechatRole = wechatRole;
        this.articleRole = articleRole;
        this.wechatEmail = wechatEmail;
        this.videoEmail = videoEmail;
        this.analysisEmail = analysisEmail;
        this.weiboRole = weiboRole;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLatestLoginTime() {
        return latestLoginTime;
    }

    public void setLatestLoginTime(String latestLoginTime) {
        this.latestLoginTime = latestLoginTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getVideoRole() {
        return videoRole;
    }

    public void setVideoRole(int videoRole) {
        this.videoRole = videoRole;
    }

    public int getWechatRole() {
        return wechatRole;
    }

    public void setWechatRole(int wechatRole) {
        this.wechatRole = wechatRole;
    }

    public int getArticleRole() {
        return articleRole;
    }

    public void setArticleRole(int articleRole) {
        this.articleRole = articleRole;
    }

    public int getWechatEmail() {
        return wechatEmail;
    }

    public void setWechatEmail(int wechatEmail) {
        this.wechatEmail = wechatEmail;
    }

    public int getVideoEmail() {
        return videoEmail;
    }

    public void setVideoEmail(int videoEmail) {
        this.videoEmail = videoEmail;
    }

    public int getAnalysisEmail() {
        return analysisEmail;
    }

    public void setAnalysisEmail(int analysisEmail) {
        this.analysisEmail = analysisEmail;
    }

    public int getWeiboRole() {
        return weiboRole;
    }

    public void setWeiboRole(int weiboRole) {
        this.weiboRole = weiboRole;
    }
}
