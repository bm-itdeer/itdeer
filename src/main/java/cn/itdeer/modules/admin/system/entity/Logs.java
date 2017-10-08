package cn.itdeer.modules.admin.system.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 说明： 系统-日志-实体类
 * 创建人：Itdeer
 * 创建时间：2017-08-16 下午12:30.
 */

@Entity
@Table(name="sys_logs")
public class Logs implements Serializable {

    @Id
    @GenericGenerator(name="id", strategy="uuid")
    @GeneratedValue(generator="id")
    private String id;                                      //日志ID

    private String url;                                     //请求URL
    private String method;                                  //请求方式
    private String ip;                                      //请求者IP
    private String classMethod;                            //请求方法
    private String params;                                  //请求参数

    private String menu;                                    //操作菜单
    private String level;                                   //日志级别
    private String type;                                    //日志类型（请求日志/系统日志）

    private String userId;                                  //操作人ID
    private String userName;                                //操作人
    private Date createDate;                                //创建时间

    @Column(name = "exceptions",columnDefinition="TEXT")
    private String exceptions;                              //异常信息

    public Logs(String url, String method, String ip, String classMethod, String params, String menu, String level, String type, String userId, String userName, Date createDate, String exceptions) {
        this.url = url;
        this.method = method;
        this.ip = ip;
        this.classMethod = classMethod;
        this.params = params;
        this.menu = menu;
        this.level = level;
        this.type = type;
        this.userId = userId;
        this.userName = userName;
        this.createDate = createDate;
        this.exceptions = exceptions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getClassMethod() {
        return classMethod;
    }

    public void setClassMethod(String classMethod) {
        this.classMethod = classMethod;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getExceptions() {
        return exceptions;
    }

    public void setExceptions(String exceptions) {
        this.exceptions = exceptions;
    }

    @Override
    public String toString() {
        return "Logs{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", ip='" + ip + '\'' +
                ", classMethod='" + classMethod + '\'' +
                ", params='" + params + '\'' +
                ", menu='" + menu + '\'' +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", createDate=" + createDate +
                ", exceptions='" + exceptions + '\'' +
                '}';
    }
}
