package cn.itdeer.modules.admin.security.repository;

import cn.itdeer.modules.admin.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * 描述：
 * 创建人：Itdeer
 * 创建时间：2017/11/14 21:54
 */

@Repository
@Transactional
public interface RoleRepository extends JpaRepository<Role,String> {


}
