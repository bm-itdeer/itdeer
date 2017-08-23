package cn.itdeer.modules.admin.system.service;

import cn.itdeer.modules.admin.system.entity.Metas;

import java.util.List;

/**
 * 描述：系统-页面-Service接口层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:12
 */

public interface MetasService {

    /**
     * 查询全部
     * @return
     */
    List<Metas> findAll();

    /**
     * 按ID-查询
     * @param id
     * @return
     */
    Metas findById(String id);

    /**
     * 页面配置信息-保存
     * @param metas
     */
    void save(Metas metas);

    /**
     * 删除-按ID
     * @param id
     */
    void delete(String id);

    /**
     * 按类型(Type)查询
     * @param type
     * @return
     */
    Metas findByType(String type);

}
