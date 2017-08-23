package cn.itdeer.modules.admin.system.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 描述：系统后台管理Controller控制器层
 * 创建人：Itdeer
 * 创建时间：2017/8/5 9:19
 */
@Controller
@RequestMapping("/admin")
public class SystemController {

    @RequestMapping("")
    public String toIndex() {
        return "admin/system/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(){
        return "admin/system/index";
    }

}
