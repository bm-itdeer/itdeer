package cn.itdeer.modules.admin.system.web;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.common.base.BaseMessage;
import cn.itdeer.modules.admin.system.entity.Dict;
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

import java.awt.print.Pageable;
import java.util.List;

/**
 * 描述：系统-字典-Controller层
 * 创建人：Itdeer
 * 创建时间：2017/8/19 16:23
 */

@Controller
@RequestMapping("/admin/sys/dict")
public class DictController extends BaseController{

    @Autowired
    private DictService dictService;

    /**
     * 分页-全部-查询
     * @param page
     * @param model
     * @return
     */
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(@RequestParam(value = "page", defaultValue = "0") Integer page,Model model){
        Page<Dict> pageList = dictService.findAll(page);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_dict";
    }

    /**
     * 按ID-查询
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String form(@RequestParam String id,Model model){
        if(id != null){
            Dict form = dictService.findById(id);
            model.addAttribute("form",form);
        }

        List<String> list = dictService.type();
        model.addAttribute("list",list);
        return "admin/system/form_dict";
    }

    /**
     * 字典-保存
     * @param dict
     * @param model
     * @param ra
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(Dict dict,Model model,RedirectAttributes ra){
        dictService.save(dict);
        addMessage(ra,new BaseMessage("字典信息保存完成","执行成功！","success"));

        Page<Dict> pageList = dictService.findByType(0,dict.getType());
        model.addAttribute("pageList",pageList);
        return "admin/system/list_dict";
    }

    /**
     * 字典-删除-按ID
     * @param id
     * @param model
     * @param ra
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable String id, Model model, RedirectAttributes ra){
        dictService.delete(id);
        addMessage(ra,new BaseMessage("字典信息删除完成","执行成功！","success"));
        return "redirect:/admin/system/dict/findAll";
    }

    /**
     * 描述模糊查询
     * @param page
     * @param description
     * @param model
     * @return
     */
    @RequestMapping(value = "/desLike",method = RequestMethod.GET)
    public String desLike(@RequestParam(value = "page", defaultValue = "0") Integer page,@RequestParam String description, Model model){
        Page<Dict> pageList = dictService.desLike(page,description);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_dict";
    }

}
