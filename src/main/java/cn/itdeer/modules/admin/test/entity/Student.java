package cn.itdeer.modules.admin.test.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 描述：
 * 创建人：Itdeer
 * 创建时间：2017/11/15 0:18
 */
@Entity
@Table(name = "test_student")
public class Student {
    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id", strategy="uuid")
    private String id;
    private String name;

    public Student() {
    }

    public Student(String name, School school) {
        this.name = name;
        this.school = school;
    }

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
