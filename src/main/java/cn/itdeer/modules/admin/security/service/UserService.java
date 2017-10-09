package cn.itdeer.modules.admin.security.service;

import cn.itdeer.modules.admin.security.entity.User;

/**
 * 描述：系统-用户-Service接口层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:11
 */

public interface UserService {

    /**
     * 按照用户名查询
     * @param username
     * @return
     */
    User findByUserName(String username);

}
