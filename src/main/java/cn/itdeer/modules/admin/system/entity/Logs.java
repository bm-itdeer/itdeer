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
    private String id;                              //日志ID

    private String userName;                        //操作人
    private String level;                           //日志级别
    private String type;                            //日志类型（请求日志/系统日志）
    private String title;                           //日志标题
    private Date createDate;                        //创建时间
    private String remoteAddr;                      //操作者ID
    private String requestUri;                      //请求URI
    private String method;                          //请求方法
    private String params;                          //请求提交数据

    @Column(name = "exceptions",columnDefinition="TEXT")
    private String exceptions;                      //异常信息

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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
                ", userName='" + userName + '\'' +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", createDate=" + createDate +
                ", remoteAddr='" + remoteAddr + '\'' +
                ", requestUri='" + requestUri + '\'' +
                ", method='" + method + '\'' +
                ", params='" + params + '\'' +
                ", exceptions='" + exceptions + '\'' +
                '}';
    }
}
