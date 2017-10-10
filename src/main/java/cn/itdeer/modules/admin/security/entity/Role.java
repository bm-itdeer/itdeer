package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * 描述：权限-角色-实体类
 * 创建人：Itdeer
 * 创建时间：2017/10/9 22:28
 */

@Entity
@Table(name="authority_role")
public class Role extends BaseEntity {

    private String name;          //角色名称
    private String useable; 		//是否是可用

    @ManyToMany(cascade = {CascadeType.REFRESH},fetch = FetchType.EAGER)
    private List<Menu> menus;     //角色菜单列表

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUseable() {
        return useable;
    }

    public void setUseable(String useable) {
        this.useable = useable;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
