package cn.itdeer.modules.admin.test.service;

import cn.itdeer.modules.admin.test.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 描述：
 * 创建人：Itdeer
 * 创建时间：2017/11/15 0:28
 */
public interface SchoolRepository extends JpaRepository<School,String>{
}
