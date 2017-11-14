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

    @ManyToOne
    @JoinColumn(name = "menu_id",columnDefinition="varchar(50) COMMENT '父级菜单'")
    private Menu parent; // 所有父级编号

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu_id",columnDefinition="varchar(50) COMMENT '子菜单'")
    private Set<Menu> child = new HashSet<Menu>(); // 所有父级编号

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
    @Column(name = "sort",columnDefinition="bigint COMMENT '排序'")
    private Integer sort; 	// 排序

    @Basic
    @Column(name = "is_show",columnDefinition="varchar(10) COMMENT '是否在菜单中显示'")
    private boolean isShow; 	// 是否在菜单中显示（1：显示；0：不显示）

    @ManyToMany
    @JoinTable(name = "authority_role_menu", joinColumns = @JoinColumn(name = "menu_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> menus = new HashSet<Role>();     //角色菜单列表

    public Menu() {

    }

    @Override
    public String toString() {
        return "Menu{" +
                "parent=" + parent +
                ", child=" + child +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", target='" + target + '\'' +
                ", icon='" + icon + '\'' +
                ", sort=" + sort +
                ", isShow=" + isShow +
                ", menus=" + menus +
                '}';
    }

    public Menu(String menuName, String menuUrl, String target, Menu parent) {
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.target = target;
        this.parent = parent;
    }

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
