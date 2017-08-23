package cn.itdeer.modules.admin.system.service;

import cn.itdeer.modules.admin.system.entity.Metas;
import cn.itdeer.modules.admin.system.repository.MetasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：系统-页面-Service实现层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:12
 */

@Service
public class MetasServiceImpl implements MetasService{

    @Autowired
    private MetasRepository metasRepository;

    /**
     * 查询全部
     * @return
     */
    @Override
    public List<Metas> findAll() {
        return metasRepository.findAll();
    }

    /**
     * 按ID-查询
     * @param id
     * @return
     */
    @Override
    public Metas findById(String id) {
        return metasRepository.findOne(id);
    }

    /**
     * 页面配置信息-保存
     * @param metas
     */
    @Override
    public void save(Metas metas) {
        metasRepository.save(metas);
    }

    /**
     * 删除-按ID
     * @param id
     */
    @Override
    public void delete(String id) {
        metasRepository.delete(id);
    }

    /**
     * 按类型(Type)查询
     * @param type
     * @return
     */
    @Override
    public Metas findByType(String type) {
        return metasRepository.findByType(type);
    }
}
