package cn.itdeer.modules.admin.blog.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 说明： 博客-文章-实体类
 * 创建人：Itdeer
 * 创建时间：2017-08-16 上午11:11.
 */

@Entity
@Table(name="bolg_article")
public class Article implements Serializable {

    @Id
    @GenericGenerator(name="id", strategy="uuid")
    @GeneratedValue(generator="id")
    private String id;                                        //文章ID
    private String title;                                    //文章标题

    @Column(name = "text_content",columnDefinition="TEXT")
    private String textContent;                             //TEXT内容
    @Column(name = "html_content",columnDefinition="TEXT")
    private String htmlContent;                             //HTML内容

    private Date createDate;                                //创建时间
    private Date editDate;                                  //修改时间
    private Date releaseDate;                               //发布时间

    private Boolean releaseState;                           //发布状态
    private Boolean ifComment;                              //是否允许评论

    private String userId;                                  //用户ID
    private String userName;                                //用户名称
    private String pictureId;                               //封面图片ID
    private String pictureUrl;                              //封面图片地址

    private int commentNum;                                 //评论数
    private int hits;                                        //点击数

    private String type;                                    //文章类型
    private String category;                                //文章类别
    private String tags;                                    //文章标签


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

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(Boolean releaseState) {
        this.releaseState = releaseState;
    }

    public Boolean getIfComment() {
        return ifComment;
    }

    public void setIfComment(Boolean ifComment) {
        this.ifComment = ifComment;
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

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", textContent='" + textContent + '\'' +
                ", htmlContent='" + htmlContent + '\'' +
                ", createDate=" + createDate +
                ", editDate=" + editDate +
                ", releaseDate=" + releaseDate +
                ", releaseState=" + releaseState +
                ", ifComment=" + ifComment +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", pictureId='" + pictureId + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", commentNum=" + commentNum +
                ", hits=" + hits +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", tags='" + tags + '\'' +
                '}';
    }
}
