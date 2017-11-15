package cn.itdeer.modules.admin.security.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 描述：权限-用户/角色-实体类
 * 创建人：Itdeer
 * 创建时间：2017/11/15 21:36
 */

@Entity
@Table(name = "authority_user_role")
public class UserRole implements Serializable {

    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id", strategy="uuid")
    @Column(name = "id",columnDefinition="varchar(50) COMMENT 'ID'")
    private String id;

    @Basic
    @Column(name = "user_id",columnDefinition="varchar(50) COMMENT '用户ID'")
    private String userId;

    @Basic
    @Column(name = "role_id",columnDefinition="varchar(50) COMMENT '角色ID'")
    private String roleId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
