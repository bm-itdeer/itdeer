package cn.itdeer.modules.admin.system.repository;

import cn.itdeer.modules.admin.system.entity.Logs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.Date;

/**
 * 描述：系统-日志-Data Repository层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:10
 */

@Repository
@Transactional
public interface LogsRepository extends JpaRepository<Logs,String> {

    /**
     * 按照类型(Type)查询,按照时间降序
     * @param type
     * @param pageable
     * @return
     */
    Page<Logs> findByType(String type, Pageable pageable);

    /**
     * 按照级别(Level)查询,按照时间降序
     * @param level
     * @param pageable
     * @return
     */
    Page<Logs> findByLevel(String level, Pageable pageable);

    /**
     * 分页-按日期期间-查询-按时间降序
     * @param endDate
     * @param startDate
     * @param pageable
     * @return
     */
    Page<Logs> findByCreateDateAfterAndCreateDateBefore(Date startDate,Date endDate,Pageable pageable);

    /**
     * 分页-按标题模糊-查询-按时间降序
     * @param title
     * @param pageable
     * @return
     */
    Page<Logs> findByTitleLike(String title,Pageable pageable);

}
