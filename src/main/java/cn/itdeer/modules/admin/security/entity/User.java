package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 说明： 权限-用户-实体类
 * 创建人：Itdeer
 * 创建时间：2017-08-16 上午10:48.
 */

@Entity
@Table(name="authority_user")
public class User extends BaseEntity {

    private String userName;                            //用户名称
    private String email;                           //用户Email
    private String password;                        //用户登录密码

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

    @ManyToMany(cascade = {CascadeType.REFRESH},fetch = FetchType.EAGER)
    private List<Role> roles;                       //用户权限


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
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
                ", roles=" + roles +
                '}';
    }
}
