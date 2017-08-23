package cn.itdeer.modules.admin.system.repository;

import cn.itdeer.modules.admin.system.entity.Metas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * 描述：系统-页面-Data Repository层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:10
 */

@Repository
@Transactional
public interface MetasRepository  extends JpaRepository<Metas  ,String> {

    /**
     * 按类型(Type)查询
     * @param type
     * @return
     */
    Metas findByType(String type);
}
