package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 描述：权限-角色-实体类
 * 创建人：Itdeer
 * 创建时间：2017/10/9 22:28
 */

@Entity
@Table(name="authority_role")
public class Role extends BaseEntity {

    @Basic
    @Column(name = "role_name",columnDefinition="varchar(50) COMMENT '角色名称'")
    private String roleName;          //角色名称

    @Basic
    @Column(name = "useable",columnDefinition="varchar(10) COMMENT '是否是可用'")
    private boolean useable; 		//是否是可用

    @ManyToMany
    @JoinTable(name = "authority_user_role", joinColumns = @JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users = new HashSet<User>();

    @ManyToMany
    @JoinTable(name = "authority_role_menu", joinColumns = @JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name = "menu_id"))
    private Set<Menu> menus = new HashSet<Menu>();     //角色菜单列表

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isUseable() {
        return useable;
    }

    public void setUseable(boolean useable) {
        this.useable = useable;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }
}
