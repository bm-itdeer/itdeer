package cn.itdeer.modules.admin.security.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 描述：权限-资源-实体类
 * 创建人：Itdeer
 * 创建时间：2017/10/9 22:43
 */

@Entity
@Table(name="authority_menu")
public class Menu implements Serializable {
    @Id
    @GenericGenerator(name="id", strategy="uuid")
    @GeneratedValue(generator="id")
    protected String id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
