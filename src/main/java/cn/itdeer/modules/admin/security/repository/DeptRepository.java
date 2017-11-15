package cn.itdeer.modules.admin.security.repository;

import cn.itdeer.modules.admin.security.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * 描述：系统-部门-Data Repository层
 * 创建人：Itdeer
 * 创建时间：2017/11/15 21:47
 */

@Repository
@Transactional
public interface DeptRepository extends JpaRepository<Dept,String>{


}
