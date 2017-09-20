package cn.itdeer.modules.admin.blog.web;

import cn.itdeer.modules.admin.blog.entity.Article;
import cn.itdeer.modules.admin.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述：博客-文章-Controller层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:03
 */
@Controller
@RequestMapping("/admin/blog/article")
public class ArticleController {

    @Autowired
    private  ArticleService articleService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(@RequestParam(value = "page", defaultValue = "0") Integer page, Model model){
        //获取文章列表
        Page<Article> pageList = articleService.findAll(page);
        model.addAttribute("pageList",pageList);
        //获取分类列表

        //model.addAttribute("url","/admin/system/dict/findAll");
        return "admin/blog/article_list";
    }


    @RequestMapping(value = "/form/{id}",method = RequestMethod.GET)
    public String form(@PathVariable String id, Model model){
        if(id != null){
            Article form = articleService.findById(id);
            model.addAttribute("form",form);
        }

        return "admin/blog/article_form";
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String edit(@PathVariable String id, Model model){

        return "admin/blog/article_content";
    }


}
