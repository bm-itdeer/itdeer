package cn.itdeer.modules.admin.system.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 说明： 系统-图片-实体类
 * 创建人：Itdeer
 * 创建时间：2017-08-16 上午11:36.
 */

@Entity
@Table(name="sys_picture")
public class Picture implements Serializable {

    @Id
    @GenericGenerator(name="id", strategy="uuid")
    @GeneratedValue(generator="id")
    private String id;                              //图片ID

    private String name;                            //图片名称
    private String groups;                          //图片所属组
    private String type;                            //图片类型
    private String url;                             //图片路径

    private Date createDate;                        //创建时间
    private Date editDate;                          //修改时间

    private String userId;                          //上传者ID
    private String userName;                        //上传者名称

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

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", groups='" + groups + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", createDate=" + createDate +
                ", editDate=" + editDate +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
