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

    @RequestMapping(value = "/history",method = RequestMethod.GET)
    public String history(){
        return "front/blog/theme1/history";
    }

    @RequestMapping(value = "/links",method = RequestMethod.GET)
    public String links(){
        return "front/blog/theme1/links";
    }

    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String about(){
        return "front/blog/theme1/about";
    }

    @RequestMapping(value = "/archives",method = RequestMethod.GET)
    public String archives(){
        return "front/blog/theme1/archives";
    }

}
