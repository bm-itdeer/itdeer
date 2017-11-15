package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
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

    @Basic
    @Column(name = "dept_id",columnDefinition="varchar(50) COMMENT '部门ID'")
    private String deptId;

    @Basic
    @Column(name = "dept_name",columnDefinition="varchar(50) COMMENT '部门名称'")
    private String deptName;

    @Transient
    private Set<Dept> depts = new HashSet<Dept>();  //部门列表

    @Transient
    private Set<User> users = new HashSet<User>();  //用户列表

    @Transient
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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Set<Dept> getDepts() {
        return depts;
    }

    public void setDepts(Set<Dept> depts) {
        this.depts = depts;
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
