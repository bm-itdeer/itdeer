package cn.itdeer.common.base;

import cn.itdeer.modules.admin.system.entity.Dict;
import cn.itdeer.modules.admin.system.entity.Logs;
import cn.itdeer.modules.admin.system.service.DictService;
import cn.itdeer.modules.admin.system.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * 说明： 基础Controller
 * 创建人：Itdeer
 * 创建时间：2017-08-21 下午3:33.
 */
public abstract class BaseController {

    @Autowired
    private DictService dictService;
    @Autowired
    private LogsService logsService;

    /**
     * 定义提示信息属性
     */
    private static final String option = "<script>toastr.option = {\"closeButton\": true,\"progressBar\": true,\"timeOut\": 8000} \n";

    /**
     * 请求转发携带消息
     * @param model
     * @param baseMessage
     */
    protected void addMessage(Model model,BaseMessage baseMessage) {
        String message = "toastr." + baseMessage.getType() + "(\"" + baseMessage.getMessage() + "\", \""+ baseMessage.getTitle() +"\");</script>";
        model.addAttribute("message", option + message);
    }

    /**
     * 请求重定向携带消息
     * @param redirectAttributes
     * @param baseMessage
     */
    protected void addMessage(RedirectAttributes redirectAttributes,BaseMessage baseMessage){
        String message = "toastr." + baseMessage.getType() + "(\"" + baseMessage.getMessage() + "\", \""+ baseMessage.getTitle() +"\");</script>";
        redirectAttributes.addFlashAttribute("message",option + message);
    }

    /**
     * 设置字典类型1个列表
     * @param model
     * @param type
     * @param method
     * @param param
     */
    protected void addDict(Model model,String type,String method,String param){

        List<Dict> dict_one =  dictService.findByType(type);
        model.addAttribute("dict_one",dict_one);

        model.addAttribute("url","/admin/" + method + "?" + param + "=" + param + "&");
    }

    /**
     * 设置字典类型2个列表
     * @param model
     * @param type1
     * @param type2
     */
    protected void addDict(Model model,String type1,String type2){

        List<Dict> dict_one =  dictService.findByType(type1);
        model.addAttribute("dict_one",dict_one);

        List<Dict> dict_two =  dictService.findByType(type2);
        model.addAttribute("dict_two",dict_two);
    }

    /**
     * 记录日志
     * @param request
     * @param logs
     */
    protected void addLogs(HttpServletRequest request,Logs logs){
        //UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        logs.setUserName("admin");  //之后开启权限控制，这里需要获取登录用户

        logs.setCreateDate(new Date());
        logs.setRemoteAddr(request.getRemoteAddr());
        logs.setRequestUri(request.getRequestURI());
        logs.setMethod(request.getMethod());
        logs.setParams(request.getQueryString());
        logsService.save(logs);
    }

}
