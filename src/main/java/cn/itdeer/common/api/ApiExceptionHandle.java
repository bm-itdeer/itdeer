package cn.itdeer.common.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述：Api异常捕获工具类
 * 创建人：Itdeer
 * 创建时间：2017/10/8 23:36
 */

@ControllerAdvice
public class ApiExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ApiExceptionHandle.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ApiResult handle(Exception e){
        if(e instanceof ApiException){
            ApiException apiException = (ApiException)e;
            return ApiResultStatus.error(apiException.getCode(),apiException.getMessage());
        }else{
            logger.error("系统异常{}",e);
            return ApiResultStatus.error(-1,"未知错误");
        }
    }
}
