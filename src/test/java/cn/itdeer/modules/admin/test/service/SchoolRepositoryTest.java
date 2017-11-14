package cn.itdeer.modules.admin.test.service;

import cn.itdeer.modules.admin.test.entity.School;
import cn.itdeer.modules.admin.test.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * 描述：
 * 创建人：Itdeer
 * 创建时间：2017/11/15 0:29
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class SchoolRepositoryTest {

    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    StudentRepository studentRepository;

    @Test
    public void save(){

        School school = new School();
        school.setName("河南大学");

        Student student1 = new Student("张三",school);
//        studentRepository.save(student1);

        Student student2 = new Student("李四",school);
//        studentRepository.save(student2);

        /*Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);*/

        school.addStudent(student1);
        school.addStudent(student2);

//        school.setStudents(students);

        schoolRepository.save(school);

    }

    @Test
    public void getSchool(){

        School school = schoolRepository.findOne("297ef9275fbb6a89015fbb6aa6b60000");

        System.out.println(school.toString());


    }
}