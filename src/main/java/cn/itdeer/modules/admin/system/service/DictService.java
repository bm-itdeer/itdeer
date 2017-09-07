package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.ValidateException;
import cn.itdeer.modules.admin.system.entity.Dict;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 描述：系统-字典-Service接口层
 * 创建人：Itdeer
 * 创建时间：2017/8/19 16:22
 */

public interface DictService {

    /**
     * 获取所有类型
     * @return
     */
    List<String> type();

    /**
     * 描述模糊查询
     * @param page
     * @param description
     * @return
     */
    Page<Dict> desLike(Integer page,String description);

    /**
     * 字典-保存
     * @param dict
     */
    void save(Dict dict) throws ValidateException;

    /**
     * 字典-按ID-删除
     * @param id
     */
    void delete(String id);

    /**
     * 按类型-查询
     * @param type
     * @return
     */
    List<Dict> findByType(String type);

    /**
     * 分页-按类型-查询
     * @param page
     * @param type
     * @return
     */
    Page<Dict> findByType(Integer page,String type);

    /**
     * 分页-查询所有
     * @param page
     * @return
     */
    Page<Dict> findAll(Integer page);

    /**
     * 字典-按ID-查询
     * @param id
     * @return
     */
    Dict findById(String id);

}
