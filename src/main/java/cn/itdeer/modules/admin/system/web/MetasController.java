package cn.itdeer.modules.admin.system.web;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.common.base.BaseMessage;
import cn.itdeer.modules.admin.system.entity.Metas;
import cn.itdeer.modules.admin.system.service.MetasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * 描述：系统-页面-Controller层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:13
 */

@Controller
@RequestMapping("/admin/sys/metas")
public class MetasController extends BaseController{

    @Autowired
    private MetasService metasService;

    /**
     * 页面信息-按ID-查询
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public String findById(@PathVariable String id, Model model){
        Metas metas = metasService.findById(id);
        model.addAttribute("metas",metas);
        return "admin/system/detailed_metas";
    }

    /**
     * 查询全部
     * @param model
     * @return
     */
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(Model model){
        List<Metas> list = metasService.findAll();
        model.addAttribute("list",list);
        return "admin/system/list_metas";
    }

    /**
     * 删除-按ID
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable String id, RedirectAttributes ra, Model model){
        metasService.delete(id);
        addMessage(ra,new BaseMessage("页面配置信息删除完成","执行成功！","success"));
        return "redirect:/admin/system/metas/findAll";
    }

    /**
     * 按类型(Type)查询
     * @param type
     * @param model
     * @return
     */
    @RequestMapping(value = "/findByType/{type}",method = RequestMethod.GET)
    public String findByType(@PathVariable String type,Model model){
        Metas metas = metasService.findByType(type);
        model.addAttribute("metas",metas);
        return "admin/system/list_metas";
    }

    /**
     * 页面配置信息-保存
     * @param metas
     * @param model
     * @param ra
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(Metas metas,Model model,RedirectAttributes ra){
        metasService.save(metas);
        addMessage(ra,new BaseMessage("页面配置信息保存完成","执行成功！","success"));
        return "redirect:/admin/system/metas/findAll";
    }

}
