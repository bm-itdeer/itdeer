package cn.itdeer.modules.admin.security.repository;

import cn.itdeer.modules.admin.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * 描述：系统-用户-Data Repository层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:10
 */

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,String> {

    /**
     * 按照用户名查询
     * @param username
     * @return
     */
    User findByUserName(String username);
}
