package cn.itdeer.modules.admin.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：系统-用户-Controller层
 * 创建人：Itdeer
 * 创建时间：2017/8/17 22:29
 */

@Controller
@RequestMapping("/admin/security/user")
public class UserController {

    @GetMapping("/findAll")
    public String findAll(){

        System.out.println("用户列表");
        return  null;
    }

}
