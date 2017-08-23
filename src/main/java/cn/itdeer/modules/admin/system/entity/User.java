package cn.itdeer.modules.admin.system.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 说明： 系统-用户-实体类
 * 创建人：Itdeer
 * 创建时间：2017-08-16 上午10:48.
 */

@Entity
@Table(name="sys_user")
public class User implements Serializable{

    @Id
    @GenericGenerator(name="id", strategy="uuid")
    @GeneratedValue(generator="id")
    private String id;                              //用户ID

    private String name;                            //用户名称
    private String email;                           //用户Email
    private String password;                        //用户登录密码

    private Date   createDate;                      //注册时间
    private Date   lastLoginDate;                   //最后登录时间

    private String mobile;                          //手机号码
    private String userType;                        //用户类型
    private String lastLoginIp;                     //最后登录IP

    private Boolean ifLogin;                        //是否允许登录
    private Boolean activeState;                    //是否允许登录

    private String pictureId;                       //头像图片ID
    private String pictureUrl;                      //头像图片地址

    private String homeTown;                        //家乡地址
    private String address;                         //现在住址
    private String description;                     //简单描述

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Boolean getIfLogin() {
        return ifLogin;
    }

    public void setIfLogin(Boolean ifLogin) {
        this.ifLogin = ifLogin;
    }

    public Boolean getActiveState() {
        return activeState;
    }

    public void setActiveState(Boolean activeState) {
        this.activeState = activeState;
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                ", lastLoginDate=" + lastLoginDate +
                ", mobile='" + mobile + '\'' +
                ", userType='" + userType + '\'' +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", ifLogin=" + ifLogin +
                ", activeState=" + activeState +
                ", pictureId='" + pictureId + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
