package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.base.BasePageBuilder;
import cn.itdeer.common.config.ConfigProperties;
import cn.itdeer.modules.admin.system.entity.Picture;
import cn.itdeer.modules.admin.system.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：系统-图片-Service实现层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:13
 */

@Service
public class PictureServiceImpl implements PictureService{

    @Autowired
    private PictureRepository pictureRepository;
    @Autowired
    private ConfigProperties configProperties;

    //定义时间降序Sort
    private Sort sort = new Sort(Sort.Direction.ASC,"createDate");

    /**
     * 获取所有组
     * @return
     */
    @Override
    public List<String> groups() {
        return pictureRepository.groups();
    }

    /**
     * 移动分组
     * @param id
     * @param groups
     */
    @Override
    public void changeGroups(String id, String groups) {
        Picture picture = pictureRepository.findOne(id);
        picture.setGroups(groups);
        pictureRepository.save(picture);
    }

    /**
     * 分页-查询所有
     * @param page
     * @return
     */
    @Override
    public Page<Picture> findAll(Integer page) {
        return pictureRepository.findAll(BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    /**
     * 按ID查询
     * @param id
     * @return
     */
    @Override
    public Picture findById(String id) {
        return pictureRepository.findOne(id);
    }

    /**
     * 分页-按类型查询
     * @param page
     * @param type
     * @return
     */
    @Override
    public Page<Picture> findByType(Integer page, String type) {
        return pictureRepository.findByType(type,BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    /**
     * 分页-按组-查询
     * @param page
     * @param groups
     * @return
     */
    @Override
    public Page<Picture> findByGroups(Integer page, String groups) {
        return pictureRepository.findByGroups(groups,BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    /**
     * 分页-按名称-模糊查询
     * @param page
     * @param name
     * @return
     */
    @Override
    public Page<Picture> findByNameLike(Integer page, String name) {
        return pictureRepository.findByNameLike(name,BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    /**
     * 按ID-删除
     * @param id
     */
    @Override
    public void delete(String id) {
        pictureRepository.delete(id);
    }

    /**
     * 保存数据
     * @param picture
     */
    @Override
    public void save(Picture picture) {
        pictureRepository.save(picture);
    }
}
