package cn.itdeer.modules.admin.blog.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 说明： 博客-类别-实体类
 * 创建人：Itdeer
 * 创建时间：2017-08-16 下午12:31.
 */

@Entity
@Table(name="blog_category")
public class Category implements Serializable{

    @Id
    @GenericGenerator(name="id", strategy="uuid")
    @GeneratedValue(generator="id")
    private String id;                               //类别ID

    private String name;                             //类别名称
    private Date createDate;                        //创建时间
    private Date editDate;                          //修改时间
    private String userId;                          //用户ID
    private String userName;                        //用户名称
    private String description;                     //描述

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", editDate=" + editDate +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
