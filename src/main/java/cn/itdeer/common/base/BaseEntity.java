package cn.itdeer.common.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 描述：基础实体类
 * 创建人：Itdeer
 * 创建时间：2017/10/10 22:06
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id", strategy="uuid")
    protected String id;

    @Column
    protected String remarks;	        // 备注
    protected Date updateDate;	    // 更新日期
    protected Date createDate;	    // 创建日期

    protected String createByUser;	        // 创建者
    protected String updateByUser;	        // 更新者
    protected String presentUser;      //当前用户

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateByUser() {
        return createByUser;
    }

    public void setCreateByUser(String createByUser) {
        this.createByUser = createByUser;
    }

    public String getUpdateByUser() {
        return updateByUser;
    }

    public void setUpdateByUser(String updateByUser) {
        this.updateByUser = updateByUser;
    }

    public String getPresentUser() {
        return presentUser;
    }

    public void setPresentUser(String presentUser) {
        this.presentUser = presentUser;
    }
}
