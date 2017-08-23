package cn.itdeer.modules.admin.system.service;

import cn.itdeer.modules.admin.system.entity.Picture;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 描述：系统-图片-Service接口层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:13
 */

public interface PictureService {

    /**
     * 获取所有组
     * @return
     */
    List<String> groups();

    /**
     * 移动分组
     * @param id
     * @param groups
     */
    void changeGroups(String id,String groups);

    /**
     * 分页-查询所有
     * @param page
     * @return
     */
    Page<Picture> findAll(Integer page);

    /**
     * 按ID查询
     * @param id
     * @return
     */
    Picture findById(String id);

    /**
     * 分页-按类型查询
     * @param page
     * @param type
     * @return
     */
    Page<Picture> findByType(Integer page,String type);

    /**
     * 分页-按组-查询
     * @param page
     * @param groups
     * @return
     */
    Page<Picture> findByGroups(Integer page,String groups);

    /**
     * 分页-按名称-模糊查询
     * @param page
     * @param name
     * @return
     */
    Page<Picture> findByNameLike(Integer page,String name);

    /**
     * 按ID-删除
     * @param id
     */
    void delete(String id);

    /**
     * 保存数据
     * @param picture
     */
    void save(Picture picture);

}
