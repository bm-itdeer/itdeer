package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 描述：权限-资源-实体类
 * 创建人：Itdeer
 * 创建时间：2017/10/9 22:43
 */

@Entity
@Table(name="authority_menu")
public class Menu extends BaseEntity {

    @Basic
    @Column(name = "parent_id",columnDefinition="varchar(10) COMMENT '父级菜单ID'")
    private String parentId; // 父级编号

    @Basic
    @Column(name = "parent_name",columnDefinition="varchar(20) COMMENT '父级菜单名称'")
    private String parentName; // 父级菜单名称

    @Transient
    private Set<Menu> child = new HashSet<Menu>(); // 所有子菜单编号

    @Basic
    @Column(name = "menu_name",columnDefinition="varchar(50) COMMENT '菜单名称'")
    private String menuName; 	// 菜单名称

    @Basic
    @Column(name = "menu_url",columnDefinition="varchar(100) COMMENT '菜单链接'")
    private String menuUrl; 	// 菜单链接

    @Basic
    @Column(name = "target",columnDefinition="varchar(10) COMMENT '目标'")
    private String target; 	// 目标（ mainFrame、_blank、_self、_parent、_top）

    @Basic
    @Column(name = "icon",columnDefinition="varchar(50) COMMENT '图标'")
    private String icon; 	// 图标

    @Basic
    @Column(name = "type",columnDefinition="varchar(10) COMMENT '类型'")
    private String type; 	// 菜单类型 类型     0：目录   1：菜单   2：按钮

    @Basic
    @Column(name = "sort",columnDefinition="bigint COMMENT '排序'")
    private Integer sort; 	// 排序

    @Basic
    @Column(name = "open",columnDefinition="varchar(10) COMMENT 'ztree是否打开'")
    private boolean open;

    @Basic
    @Column(name = "is_show",columnDefinition="varchar(10) COMMENT '是否在菜单中显示'")
    private boolean isShow; 	// 是否在菜单中显示（1：显示；0：不显示）

    @Transient
    private Set<Role> menus = new HashSet<Role>();     //角色菜单列表


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

    public Set<Menu> getChild() {
        return child;
    }

    public void setChild(Set<Menu> child) {
        this.child = child;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public Set<Role> getMenus() {
        return menus;
    }

    public void setMenus(Set<Role> menus) {
        this.menus = menus;
    }
}
