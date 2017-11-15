package cn.itdeer.modules.admin.security.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 描述：权限-角色/部门-实体类
 * 创建人：Itdeer
 * 创建时间：2017/11/15 21:44
 */

@Entity
@Table(name = "authority_role_dept")
public class RoleDept implements Serializable {

    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id", strategy="uuid")
    @Column(name = "id",columnDefinition="varchar(50) COMMENT 'ID'")
    private String id;

    @Basic
    @Column(name = "role_id",columnDefinition="varchar(50) COMMENT '角色ID'")
    private String roleId;

    @Basic
    @Column(name = "dept_id",columnDefinition="varchar(50) COMMENT '部门ID'")
    private String deptId;

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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
}
