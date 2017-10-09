package cn.itdeer.modules.admin.security.service;

import cn.itdeer.modules.admin.security.entity.User;
import cn.itdeer.modules.admin.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：系统-用户-Service实现层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:11
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    /**
     * 按照用户名查询
     * @param username
     * @return
     */
    @Override
    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }
}
