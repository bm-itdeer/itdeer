package cn.itdeer.modules.admin.system.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 说明： 系统-页面-实体类
 * 创建人：Itdeer
 * 创建时间：2017-08-16 下午12:46.
 */

@Entity
@Table(name="sys_metas")
public class Metas implements Serializable {

    @Id
    @GenericGenerator(name="id", strategy="uuid")
    @GeneratedValue(generator="id")
    private String id;                              //页面ID

    private String keywords;                        //关键词
    private String description;                     //描述
    private String pictureId;                       //ico图片ID
    private String pictureUrl;                      //ico图片地址
    private String title;                           //标题
    private String copy;                            //copy号
    private String icp;                             //备案号

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp;
    }

    @Override
    public String toString() {
        return "Metas{" +
                "id='" + id + '\'' +
                ", keywords='" + keywords + '\'' +
                ", description='" + description + '\'' +
                ", pictureId='" + pictureId + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", title='" + title + '\'' +
                ", copy='" + copy + '\'' +
                ", icp='" + icp + '\'' +
                '}';
    }
}
