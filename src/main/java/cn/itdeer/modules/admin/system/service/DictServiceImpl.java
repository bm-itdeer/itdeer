package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.base.BasePageBuilder;
import cn.itdeer.common.config.ConfigProperties;
import cn.itdeer.common.exception.ValidateException;
import cn.itdeer.modules.admin.system.entity.Dict;
import cn.itdeer.modules.admin.system.repository.DictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：系统-字典-Service实现层
 * 创建人：Itdeer
 * 创建时间：2017/8/19 16:22
 */

@Service
public class DictServiceImpl implements DictService{

    @Autowired
    private ConfigProperties configProperties;

    @Autowired
    private DictRepository dictRepository;

    //定义降序Sort
    private Sort sort = new Sort(Sort.Direction.ASC,"sort");

    /**
     * 字典-保存
     * @param dict
     */
    @Override
    public void save(Dict dict) throws ValidateException{
        if(dict.getValue()==null || "".equals(dict.getValue())){
            throw new ValidateException("字典键值不能为空！");
        }

        if(dict.getLabel()==null || "".equals(dict.getLabel())){
            throw new ValidateException("字典标签不能为空！");
        }

        if(dict.getType()==null || "".equals(dict.getType())){
            throw new ValidateException("字典类型不能为空！");
        }

        dictRepository.save(dict);
    }

    /**
     * 按类型-查询
     * @param type
     * @return
     */
    public List<Dict> findByType(String type) {
        return dictRepository.findByType(type);
    }

    /**
     * 字典-按ID-删除
     * @param id
     */
    @Override
    public void delete(String id) {
        dictRepository.delete(id);
    }

    /**
     * 分页-按类型-查询
     * @param page
     * @param type
     * @return
     */
    @Override
    public Page<Dict> findByType(Integer page, String type) {
        return dictRepository.findByType(type,BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    /**
     * 系统-字典-Service实现-分页列表
     * @param page
     * @return
     */
    public Page<Dict> findAll(Integer page) {
        return dictRepository.findAll(BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    /**
     * 类型-查询
     * @return
     */
    @Override
    public List<String> type() {
        return dictRepository.type();
    }

    /**
     * 描述模糊查询
     * @param page
     * @param description
     * @return
     */
    @Override
    public Page<Dict> desLike(Integer page, String description) {
        return dictRepository.findByDescriptionLike(description,BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    /**
     * 字典-按ID-查询
     * @param id
     * @return
     */
    @Override
    public Dict findById(String id) {
        return dictRepository.findOne(id);
    }

}
