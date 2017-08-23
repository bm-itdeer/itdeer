package cn.itdeer.modules.admin.blog.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 说明： 博客-友链-实体类
 * 创建人：Itdeer
 * 创建时间：2017-08-16 下午12:48.
 */

@Entity
@Table(name="blog_links")
public class Links implements Serializable{

    @Id
    @GenericGenerator(name="id", strategy="uuid")
    @GeneratedValue(generator="id")
    private String id;                                  //友链ID
    private String title;                              //友链标题
    private String url;                                //友链地址
    private String pictureId;                         //友链logoID
    private String pictureUrl;                        //友链logo地址
    private int sort;                                 //排序
    private Date createDate;                          //创建时间
    private Date editDate;                            //修改时间
    private String description;                      //友链的描述
    private String type;                              //友链类型

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Links{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", pictureId='" + pictureId + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", sort=" + sort +
                ", createDate=" + createDate +
                ", editDate=" + editDate +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
