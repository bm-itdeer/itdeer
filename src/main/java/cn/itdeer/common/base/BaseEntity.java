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
    @Column(name = "id",columnDefinition="varchar(50) COMMENT 'ID'")
    private String id;

    @Basic
    @Column(name = "creater",columnDefinition="varchar(50) COMMENT '创建者'")
    private String creater;//创建者

    @Basic
    @Column(name = "create_time",columnDefinition="DATETIME COMMENT '创建时间'")
    private Date createTime = new Date();// 创建时间

    @Basic
    @Column(name = "updater",columnDefinition="varchar(50) COMMENT '更新者'")
    private String updater;//更新者

    @Basic
    @Column(name = "update_time",columnDefinition="DATETIME COMMENT '更新时间'")
    private Date updateTime = new Date();// 更新时间

    @Basic
    @Column(name = "remarks",columnDefinition="varchar(200) COMMENT '备注'")
    private String remarks;// 备注


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
