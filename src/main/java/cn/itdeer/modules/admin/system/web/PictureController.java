package cn.itdeer.modules.admin.system.web;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.common.base.BaseMessage;
import cn.itdeer.modules.admin.system.entity.Picture;
import cn.itdeer.modules.admin.system.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * 描述：系统-图片-Controller层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:13
 */

@Controller
@RequestMapping("/admin/sys/picture")
public class PictureController extends BaseController{

    @Autowired
    private PictureService pictureService;

    /**
     * 分页-全部-查询
     * @param page
     * @param model
     * @return
     */
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(@RequestParam(value = "page", defaultValue = "0") Integer page, Model model){
        Page<Picture> pageList = pictureService.findAll(page);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_picture";
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
            Picture form = pictureService.findById(id);
            model.addAttribute("form",form);
        }
        return "admin/system/form_picture";
    }

    /**
     * 分页-按类型-查询
     * @param type
     * @param model
     * @return
     */
    @RequestMapping(value = "/findByType/{type}",method = RequestMethod.GET)
    public String findByType(@RequestParam(value = "page", defaultValue = "0") Integer page, @PathVariable String type, Model model){
        Page<Picture> pageList = pictureService.findByType(page,type);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_picture";
    }

    /**
     * 分页-按组-查询
     * @param groups
     * @param model
     * @return
     */
    @RequestMapping(value = "/findByType/{groups}",method = RequestMethod.GET)
    public String findByGroups(@RequestParam(value = "page", defaultValue = "0") Integer page, @PathVariable String groups, Model model){
        Page<Picture> pageList = pictureService.findByGroups(page,groups);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_picture";
    }

    /**
     * 分页-按名称-模糊查询
     * @param name
     * @param model
     * @return
     */
    @RequestMapping(value = "/findByType/{name}",method = RequestMethod.GET)
    public String findByNameLike(@RequestParam(value = "page", defaultValue = "0") Integer page, @PathVariable String name, Model model){
        Page<Picture> pageList = pictureService.findByNameLike(page,name);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_picture";
    }

    /**
     * 删除-按ID
     * @param id
     * @param model
     * @param ra
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable String id, Model model, RedirectAttributes ra){
        pictureService.delete(id);
        addMessage(ra,new BaseMessage("字典信息删除完成","执行成功！","success"));
        return "redirect:/admin/system/picture/findAll";
    }

    /**
     * 图片-保存
     * @param dict
     * @param model
     * @param ra
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(Picture dict,Model model,RedirectAttributes ra){
        pictureService.save(dict);
        addMessage(ra,new BaseMessage("图片保存完成","执行成功！","success"));
        return "redirect:/admin/system/picture/findAll";
    }

    /**
     * 移动分组
     * @param id
     * @param groups
     * @param model
     * @return
     */
    @RequestMapping(value = "/changeGroups",method = RequestMethod.GET)
    public String changeGroups(@PathVariable String id,@PathVariable String groups,Model model){
        pictureService.changeGroups(id,groups);
        return "redirect:/admin/system/picture/findAll";
    }

    /**
     * 获取所有组
     * @param model
     * @return
     */
    @RequestMapping(value = "/getGroups",method = RequestMethod.GET)
    public String getGroups(Model model){
        List<String> list = pictureService.groups();
        model.addAttribute("list",list);
        return "admin/system/list_picture";
    }

    //TODO 文件上传 感觉最终提取到BaseController中合适
    private void upload(){

    }

}
