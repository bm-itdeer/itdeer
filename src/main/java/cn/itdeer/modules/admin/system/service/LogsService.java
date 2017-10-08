package cn.itdeer.modules.admin.system.service;

import cn.itdeer.modules.admin.system.entity.Logs;
import org.springframework.data.domain.Page;

import java.util.Date;

/**
 * 描述：系统-日志-Service接口层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:11
 */
public interface LogsService {


    /**
     * 分页-按标题模糊-查询-按时间降序
     * @param page
     * @param title
     * @return
     */
    //Page<Logs> findByTitleLike(Integer page,String title);

    /**
     * 日志-按ID-查询
     * @param id
     * @return
     */
    Logs findById(String id);

    /**
     * 分页-查询全部
     * @param page
     * @return
     */
    Page<Logs> findAll(Integer page);

    /**
     * 保存数据
     * @param logs
     */
    void save(Logs logs);

    /**
     * 删除-按ID
     * @param id
     */
    void delete(String id);

    /**
     * 日志清除
     */
    void empty();

    /**
     * 分页-按类型(Type)查询-按照时间降序
     * @param page
     * @param type
     * @return
     */
    Page<Logs> findByType(Integer page,String type);

    /**
     * 分页-按级别(Level)查询-按时间降序
     * @param page
     * @param level
     * @return
     */
    Page<Logs> findByLevel(Integer page,String level);

    /**
     * 分页-按日期期间-查询-按时间降序
     * @param page
     * @param startDate 起始时间
     * @param endDate 结束时间
     * @return
     */
    Page<Logs> findByCreateDate(Integer page,Date startDate,Date endDate);

}
