package cn.itdeer.modules.front.blog.theme1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 说明： 博客前端Controller控制器
 * 创建人：Itdeer
 * 创建时间：2017/8/5.
 */
@Controller
@RequestMapping("/blog")
public class ThemeController {


    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(){
        return "front/blog/theme1/index";
    }

}
