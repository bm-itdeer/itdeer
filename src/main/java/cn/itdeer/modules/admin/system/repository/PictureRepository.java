package cn.itdeer.modules.admin.system.repository;

import cn.itdeer.modules.admin.system.entity.Picture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 描述：系统-图片-Data Repository层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:10
 */

@Repository
@Transactional
public interface PictureRepository extends JpaRepository<Picture,String> {

    /**
     * 分页-按类型查询
     * @param type
     * @param pageable
     * @return
     */
    Page<Picture> findByType(String type, Pageable pageable);

    /**
     * 分页-按组-查询
     * @param groups
     * @param pageable
     * @return
     */
    Page<Picture> findByGroups(String groups, Pageable pageable);

    /**
     * 分页-按名称-模糊查询
     * @param name
     * @param pageable
     * @return
     */
    Page<Picture> findByNameLike(String name, Pageable pageable);

    /**
     * 获取所有组
     * @return
     */
    @Query(value = "SELECT DISTINCT groups FROM sys_picture",nativeQuery = true)
    List<String> groups();
}
