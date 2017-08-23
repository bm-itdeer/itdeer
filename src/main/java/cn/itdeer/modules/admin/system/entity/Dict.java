package cn.itdeer.modules.admin.system.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 描述： 系统-字典-实体类
 * 创建人：Itdeer
 * 创建时间：2017/8/19 16:00
 */

@Entity
@Table(name="sys_dict")
public class Dict implements Serializable{

    @Id
    @GenericGenerator(name="id", strategy="uuid")
    @GeneratedValue(generator="id")
    private String id;                              //数据字典ID

    private String value;	                        // 数据值
    private String label;	                        // 标签名
    private String type;	                        // 类型
    private String description;                     // 描述
    private int sort;	                            // 排序

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                ", label='" + label + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", sort=" + sort +
                '}';
    }
}
