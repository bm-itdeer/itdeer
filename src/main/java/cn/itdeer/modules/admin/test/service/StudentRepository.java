package cn.itdeer.modules.admin.test.service;

import cn.itdeer.modules.admin.test.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 描述：
 * 创建人：Itdeer
 * 创建时间：2017/11/15 0:29
 */
public interface StudentRepository extends JpaRepository<Student,String>{
}
