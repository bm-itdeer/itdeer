package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 描述：权限-部门-实体类
 * 创建人：Itdeer
 * 创建时间：2017/11/15 21:00
 */
@Entity
@Table(name = "authority_dept")
public class Dept extends BaseEntity{

    @Basic
    @Column(name = "parent_id",columnDefinition="varchar(50) COMMENT '上级部门ID'")
    private String parentId;

    @Basic
    @Column(name = "parent_name",columnDefinition="varchar(50) COMMENT '上级部门名称'")
    private String parentName;

    @Transient
    private Set<Dept> child = new HashSet<Dept>(); // 所有下级部门


    @Basic
    @Column(name = "sort",columnDefinition="bigint COMMENT '排序'")
    private Integer sort; 	// 排序

    @Basic
    @Column(name = "open",columnDefinition="varchar(10) COMMENT 'ztree是否打开'")
    private boolean open;


    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Set<Dept> getChild() {
        return child;
    }

    public void setChild(Set<Dept> child) {
        this.child = child;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
