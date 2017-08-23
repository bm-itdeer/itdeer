package cn.itdeer.modules.admin.blog.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 说明：系统-留言-实体类
 * 创建人：Itdeer
 * 创建时间：2017-08-16 上午11:30.
 */

@Entity
@Table(name="sys_contact")
public class Contact implements Serializable{

    @Id
    @GenericGenerator(name="id", strategy="uuid")
    @GeneratedValue(generator="id")
    private String id;                              //留言ID

    private String name;                            //留言者名称
    private String email;                           //留言者Email
    private String content;                         //留言内容
    private Boolean processState;                  //处理状态
    private Boolean sendEmailState;                //邮件发送状态

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getProcessState() {
        return processState;
    }

    public void setProcessState(Boolean processState) {
        this.processState = processState;
    }

    public Boolean getSendEmailState() {
        return sendEmailState;
    }

    public void setSendEmailState(Boolean sendEmailState) {
        this.sendEmailState = sendEmailState;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", processState=" + processState +
                ", sendEmailState=" + sendEmailState +
                '}';
    }
}
