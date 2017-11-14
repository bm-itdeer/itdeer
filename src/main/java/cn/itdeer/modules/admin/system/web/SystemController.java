package cn.itdeer.modules.admin.system.web;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.common.base.BaseMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * 描述：系统后台管理Controller控制器层
 * 创建人：Itdeer
 * 创建时间：2017/8/5 9:19
 */
@Controller
@RequestMapping("/admin")
public class SystemController extends BaseController{

    @RequestMapping(value = "")
    public String toIndex() {
        return "admin/system/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, Model model){
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");

        if(loginName.equals("sundafei") && password.equals("sundafei")){
            return "admin/system/index";
        }else{
            addMessage(model,new BaseMessage("登录失败","用户名或密码不正确！","error"));

            return "admin/system/login";
        }

    }

}
