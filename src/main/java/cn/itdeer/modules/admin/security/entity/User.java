package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Transient;

/**
 * 说明： 权限-用户-实体类
 * 创建人：Itdeer
 * 创建时间：2017-08-16 上午10:48.
 */

@Entity
@Table(name = "authority_user")
public class User extends BaseEntity{

    @Basic
    @Column(name = "user_name",columnDefinition="varchar(50) COMMENT '用户名'")
    private String userName;//用户名称

    @Basic
    @Column(name = "password",columnDefinition="varchar(50) COMMENT '密码'")
    private String password;//用户登录密码

    @Basic
    @Column(name = "email",columnDefinition="varchar(50) COMMENT '邮箱'")
    private String email;//用户Email

    @Basic
    @Column(name = "gender",columnDefinition="varchar(10) COMMENT '性别'")
    private String gender;//性别

    @Basic
    @Column(name = "mobile",columnDefinition="varchar(11) COMMENT '手机号码'")
    private String mobile;//手机号码

    @Basic
    @Column(name = "birthday",columnDefinition="varchar(20) COMMENT '生日'")
    private String birthday;//生日

    @Basic
    @Column(name = "nick_name",columnDefinition="varchar(50) COMMENT '昵称'")
    private String nickName;//昵称

    @Basic
    @Column(name = "user_type",columnDefinition="varchar(20) COMMENT '用户类型'")
    private String userType;// 0 Admin User  : !0  Other User

    @Basic
    @Column(name = "super_user",columnDefinition="varchar(10) COMMENT '是否是超级管理员'")
    private boolean superUser;//是否是超级管理员

    @Basic
    @Column(name = "password_update_time",columnDefinition="DATETIME COMMENT '密码更新时间'")
    private Date passwordUpdateTime = new Date();// 密码更新时间

    @Basic
    @Column(name = "login",columnDefinition="varchar(10) COMMENT '是否允许登录'")
    private boolean login;//是否允许登录

    @Basic
    @Column(name = "online",columnDefinition="varchar(10) COMMENT '是否在线'")
    private boolean online;//是否在线

    @Basic
    @Column(name = "active_status",columnDefinition="varchar(10) COMMENT '激活状态'")
    private boolean activeStatus;//激活状态

    @Basic
    @Column(name = "last_login_date",columnDefinition="DATETIME COMMENT '最后登录时间'")
    private Date lastLoginDate = new Date();//最后登录时间

    @Basic
    @Column(name = "last_login_ip",columnDefinition="varchar(20) COMMENT '最后登录IP'")
    private String lastLoginIp;//最后登录IP

    @Basic
    @Column(name = "picture_id",columnDefinition="varchar(50) COMMENT '头像图片ID'")
    private String pictureId;//头像图片ID

    @Basic
    @Column(name = "picture_url",columnDefinition="varchar(100) COMMENT '头像图片地址'")
    private String pictureUrl;//头像图片地址

    @Basic
    @Column(name = "province",columnDefinition="varchar(50) COMMENT '省份'")
    private String province;//省份

    @Basic
    @Column(name = "city",columnDefinition="varchar(50) COMMENT '城市'")
    private String city;//城市

    @Basic
    @Column(name = "home_town",columnDefinition="varchar(200) COMMENT '家乡地址'")
    private String homeTown;//家乡地址

    @Basic
    @Column(name = "address",columnDefinition="varchar(200) COMMENT '现在住址'")
    private String address;//现在住址


    @ManyToMany
    @JoinTable(name = "authority_user_role", joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<Role>();//用户角色

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public boolean isSuperUser() {
        return superUser;
    }

    public void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }

    public Date getPasswordUpdateTime() {
        return passwordUpdateTime;
    }

    public void setPasswordUpdateTime(Date passwordUpdateTime) {
        this.passwordUpdateTime = passwordUpdateTime;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
