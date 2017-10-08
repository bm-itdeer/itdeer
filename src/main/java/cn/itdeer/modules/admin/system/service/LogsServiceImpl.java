package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.base.BasePageBuilder;
import cn.itdeer.common.config.ConfigProperties;
import cn.itdeer.modules.admin.system.entity.Logs;
import cn.itdeer.modules.admin.system.repository.LogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 描述：系统-日志-Service实现层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:11
 */

@Service
public class LogsServiceImpl implements LogsService{

    @Autowired
    private LogsRepository logsRepository;
    @Autowired
    private ConfigProperties configProperties;

    //定义时间降序Sort
    private Sort sort = new Sort(Sort.Direction.DESC,"createDate");

    /**
     * 分页-按类型(Type)查询-按照时间降序
     * @param page
     * @param type
     * @return
     */
    @Override
    public Page<Logs> findByType(Integer page,String type) {
        return logsRepository.findByType(type,BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    /**
     * 分页-按级别(Level)查询-按时间降序
     * @param page
     * @param level
     * @return
     */
    @Override
    public Page<Logs> findByLevel(Integer page,String level) {
        return logsRepository.findByLevel(level,BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    /**
     * 分页-按标题模糊-查询-按时间降序
     * @param page
     * @param title
     * @return
     */
   /* @Override
    public Page<Logs> findByTitleLike(Integer page,String title) {
        return logsRepository.findByTitleLike(title,BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }*/

    /**
     * 分页-按日期期间-查询-按时间降序
     * @param page
     * @param startDate
     * @param endDate
     * @return
     */
    @Override
    public Page<Logs> findByCreateDate(Integer page, Date startDate, Date endDate) {
        return logsRepository.findByCreateDateAfterAndCreateDateBefore(startDate,endDate,BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    /**
     * 日志-按ID-查询
     * @param id
     * @return
     */
    @Override
    public Logs findById(String id) {
        return logsRepository.findOne(id);
    }

    /**
     * 分页-查询全部
     * @param page
     * @return
     */
    @Override
    public Page<Logs> findAll(Integer page) {
        return logsRepository.findAll(BasePageBuilder.create(page,configProperties.getSystemPagesize()));
    }

    /**
     * 保存数据
     * @param logs
     */
    @Override
    public void save(Logs logs) {
        logsRepository.save(logs);
    }

    /**
     * 删除-按ID
     * @param id
     */
    @Override
    public void delete(String id) {
        logsRepository.delete(id);
    }

    /**
     * 日志清除
     */
    @Override
    public void empty() {
        logsRepository.deleteAll();
    }
}
