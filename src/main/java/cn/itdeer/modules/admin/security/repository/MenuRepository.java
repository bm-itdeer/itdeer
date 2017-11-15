package cn.itdeer.modules.admin.security.repository;

import cn.itdeer.modules.admin.security.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * 描述：系统-菜单-Data Repository层
 * 创建人：Itdeer
 * 创建时间：2017/11/14 21:55
 */

@Repository
@Transactional
public interface MenuRepository extends JpaRepository<Menu,String>{


}
