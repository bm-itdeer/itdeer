package cn.itdeer.modules.admin.security.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 描述：权限-角色/菜单-实体类
 * 创建人：Itdeer
 * 创建时间：2017/11/15 21:41
 */

@Entity
@Table(name = "authority_role_menu")
public class RoleMenu implements Serializable {

    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id", strategy="uuid")
    @Column(name = "id",columnDefinition="varchar(50) COMMENT 'ID'")
    private String id;

    @Basic
    @Column(name = "role_id",columnDefinition="varchar(50) COMMENT '角色ID'")
    private String roleId;

    @Basic
    @Column(name = "menu_id",columnDefinition="varchar(50) COMMENT '菜单ID'")
    private String menuId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
