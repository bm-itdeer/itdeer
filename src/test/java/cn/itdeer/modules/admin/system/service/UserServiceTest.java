package cn.itdeer.modules.admin.system.service;

import cn.itdeer.modules.admin.security.entity.User;
import cn.itdeer.modules.admin.security.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述：系统-用户-Service接口层-测试
 * 创建人：Itdeer
 * 创建时间：2017/10/9 22:02
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findByName() throws Exception {
        User user = userService.findByUserName("admin");
        System.out.println(user.toString());
    }

}