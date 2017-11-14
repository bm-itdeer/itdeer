package cn.itdeer.modules.admin.test.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 描述：
 * 创建人：Itdeer
 * 创建时间：2017/11/15 0:18
 */

@Entity
@Table(name = "test_school")
public class School {
    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id", strategy="uuid")
    private String id;
    private String name;


    @OneToMany(mappedBy = "school",cascade = CascadeType.ALL)
    private Set<Student> students = new HashSet<Student>();

    public void addStudent(Student stu){
        if(stu != null){
            students.add(stu);
        }
    }

    @Override
    public String toString() {
        return "School{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
