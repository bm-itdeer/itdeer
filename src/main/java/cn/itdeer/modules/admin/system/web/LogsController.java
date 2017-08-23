package cn.itdeer.modules.admin.system.web;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.common.base.BaseMessage;
import cn.itdeer.modules.admin.system.entity.Logs;
import cn.itdeer.modules.admin.system.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

/**
 * 描述：系统-日志-Controller层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:14
 */

@Controller
@RequestMapping("/sys/logs")
public class LogsController extends BaseController{

    @Autowired
    private LogsService logsService;

    /**
     * 分页-按IP模糊-查询-按时间降序
     * @param page
     * @param ip
     * @param model
     * @return
     */
    @RequestMapping(value = "/findByRemoteAddr/{ip}",method = RequestMethod.GET)
    public String findByRemoteAddr(@RequestParam(value = "page", defaultValue = "0") Integer page,@PathVariable String ip,Model model){
        Page<Logs> pageList = logsService.findByRemoteAddr(page,ip);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_logs";
    }

    /**
     * 日志-按ID-查询
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public String findById(@PathVariable String id,Model model){
        Logs logs = logsService.findById(id);
        model.addAttribute("logs",logs);
        return "admin/system/detailed_logs";
    }

    /**
     * 分页-查询全部
     * @param page
     * @param model
     * @return
     */
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(@RequestParam(value = "page", defaultValue = "0") Integer page,Model model){
        Page<Logs> pageList = logsService.findAll(page);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_logs";
    }

    /**
     * 删除-按ID
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable String id, RedirectAttributes ra,Model model){
        logsService.delete(id);
        addMessage(ra,new BaseMessage("日志删除完成","执行成功！","success"));
        return "redirect:/admin/system/list_logs";
    }

    /**
     * 清空日志
     * @return
     */
    @RequestMapping(value = "/empty",method = RequestMethod.GET)
    public String empty(RedirectAttributes ra){
        logsService.empty();
        addMessage(ra,new BaseMessage("日志清除完成","执行成功！","success"));
        return "redirect:/admin/system/list_logs";
    }

    /**
     * 分页-按类型(Type)查询-按照时间降序
     * @param page
     * @param type
     * @param model
     * @return
     */
    @RequestMapping(value = "/findByType/{type}",method = RequestMethod.GET)
    public String findByType(@RequestParam(value = "page", defaultValue = "0") Integer page,@PathVariable String type,Model model){
        Page<Logs> pageList = logsService.findByType(page,type);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_logs";
    }

    /**
     * 分页-按级别(Level)查询-按时间降序
     * @param page
     * @param level
     * @param model
     * @return
     */
    @RequestMapping(value = "/findByLevel/{level}",method = RequestMethod.GET)
    public String findByLevel(@RequestParam(value = "page", defaultValue = "0") Integer page,@PathVariable String level,Model model){
        Page<Logs> pageList = logsService.findByLevel(page,level);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_logs";
    }

    /**
     * 分页-按日期期间-查询-按时间降序
     * @param page
     * @param startDate
     * @param endDate
     * @param model
     * @return
     */
    @RequestMapping(value = "/findByCreateDate",method = RequestMethod.POST)
    public String findByCreateDate(@RequestParam(value = "page", defaultValue = "0") Integer page, @RequestParam("startDate") Date startDate,@RequestParam("endDate") Date endDate, Model model){
        Page<Logs> pageList = logsService.findByCreateDate(page,startDate,endDate);
        model.addAttribute("pageList",pageList);
        return "admin/system/list_logs";
    }

}