package cn.itdeer.modules.admin.system.repository;

import cn.itdeer.modules.admin.system.entity.Dict;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 描述：系统-字典-Data Repository层
 * 创建人：Itdeer
 * 创建时间：2017/8/19 16:22
 */

@Repository
@Transactional
public interface DictRepository extends JpaRepository<Dict,String> {

    /**
     * 分页-按类型-查询
     * @param type
     * @param pageable
     * @return
     */
    Page<Dict> findByType(String type, Pageable pageable);

    /**
     * 类型-查询
     * @return
     */
    @Query(value = "SELECT DISTINCT type FROM sys_dict",nativeQuery = true)
    List<String> type();

    /**
     * 描述模糊查询
     * @param description
     * @param pageable
     * @return
     */
    Page<Dict> findByDescriptionLike(String description, Pageable pageable);
}
