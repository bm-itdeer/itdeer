package cn.itdeer.modules.admin.blog.web;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.common.base.BaseMessage;
import cn.itdeer.common.exception.ValidateException;
import cn.itdeer.modules.admin.blog.entity.Article;
import cn.itdeer.modules.admin.blog.service.ArticleService;
import cn.itdeer.modules.admin.system.entity.Dict;
import cn.itdeer.modules.admin.system.entity.Logs;
import cn.itdeer.modules.admin.system.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 描述：博客-文章-Controller层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:03
 */
@Controller
@RequestMapping("/admin/blog/article")
public class ArticleController extends BaseController{

    @Autowired
    private  ArticleService articleService;

    @Autowired
    private DictService dictService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(@RequestParam(value = "page", defaultValue = "0") Integer page, Model model){
        //获取文章列表
        Page<Article> pageList = articleService.findAll(page);
        model.addAttribute("pageList",pageList);
        //获取分类列表

        model.addAttribute("url","/admin/system/dict/findAll");
        return "admin/blog/article_list";
    }


    @RequestMapping(value = "/form/{id}",method = RequestMethod.GET)
    public String form(@PathVariable String id, Model model){
        if(id != null){
            Article form = articleService.findById(id);
            model.addAttribute("form",form);
        }

        List<Dict> article_type = dictService.findByType("article_type");
        model.addAttribute("article_type",article_type);

        List<Dict> article_category = dictService.findByType("article_category");
        model.addAttribute("article_category",article_category);


        return "admin/blog/article_form";
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String edit(@PathVariable String id, Model model){
        Article article = articleService.findById(id);
        model.addAttribute("form",article);
        return "admin/blog/article_content";
    }

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public String edit(Article article,RedirectAttributes ra, Model model,HttpServletRequest request){
        try {
            articleService.edit(article);
            addMessage(ra,new BaseMessage("文章编辑成功","执行成功！","success"));
           // addLogs(request,new Logs("info","操作日志","文章编辑成功",null));
        } catch (ValidateException e) {
            model.addAttribute("form",article);
            addMessage(model,new BaseMessage(e.getMessage(),"执行失败！","error"));
            //addLogs(request,new Logs("error","操作日志","文章编辑失败",e.getMessage()));
            return "admin/blog/article_content";
        }
        return "redirect:/admin/blog/article/findAll";
    }


    /**
     * 文章-保存
     * @param article
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(Article article, Model model, RedirectAttributes ra,HttpServletRequest request){
        try {
            System.out.println(article.toString());
            articleService.save(article);
            addMessage(ra,new BaseMessage("文章添加成功","执行成功！","success"));
           // addLogs(request,new Logs("info","操作日志","文章添加成功",null));
        } catch (ValidateException e) {
            model.addAttribute("form",article);
            addMessage(model,new BaseMessage(e.getMessage(),"执行失败！","error"));
           // addLogs(request,new Logs("error","操作日志","文章添加失败",e.getMessage()));
            return "admin/blog/article_form";
        }
        return "redirect:/admin/blog/article/findAll";
    }

    /**
     * 文章-删除-按ID
     * @param id
     * @param model
     * @param ra
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable String id, Model model, RedirectAttributes ra,HttpServletRequest request){
        articleService.delete(id);
        addMessage(ra,new BaseMessage("文章信息删除完成","执行成功！","success"));
        return "redirect:/admin/blog/article/findAll";
    }

    /**
     * 文章-预览-按ID
     * @param id
     * @param model
     * @param ra
     * @return
     */
    @RequestMapping(value = "/view/{id}",method = RequestMethod.GET)
    public String view(@PathVariable String id, Model model, RedirectAttributes ra,HttpServletRequest request){
        Article article = articleService.findById(id);
        model.addAttribute("article",article);
        return "admin/blog/article_view";
    }

}
