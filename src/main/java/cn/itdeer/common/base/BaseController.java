package cn.itdeer.common.base;

import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 说明： 基础Controller
 * 创建人：Itdeer
 * 创建时间：2017-08-21 下午3:33.
 */
public abstract class BaseController {

    /**
     * 定义提示信息属性
     */
    private static final String option = "<script>toastr.option = {\"closeButton\": true,\"progressBar\": true,\"timeOut\": 8000}";

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

}
