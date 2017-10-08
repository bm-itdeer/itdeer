package cn.itdeer.common.aop;

import cn.itdeer.modules.admin.system.entity.Logs;
import cn.itdeer.modules.admin.system.service.LogsService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 描述：日志处理AOP
 * 创建人：Itdeer
 * 创建时间：2017/9/30 23:56
 */
@Aspect
@Order(1)
@Component
public class LogAop {

    private final static Logger logger = LoggerFactory.getLogger(LogAop.class);

    @Autowired
    private LogsService logsService;

    /**
     * 日志
     */
    @Pointcut("execution(public * cn.itdeer.modules.admin.*.web..*(..))")
    public void log() {
    }

    /**
     * 业务处理之前
     */
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = sra.getRequest();

        //防止调用方法为空时，参数为空，数组越界
        String classMethod = null ;
        if(joinPoint.getArgs().length != 0){
            classMethod = joinPoint.getArgs()[0].toString();
        }

        logsService.save(
                new Logs(request.getRequestURL().toString(),
                        request.getMethod(),
                        request.getRemoteAddr(),
                        joinPoint.getSignature().getDeclaringType() + "." + joinPoint.getSignature().getName(),
                        classMethod,
                        null,
                        "info",
                        "系统日志",
                        "123",
                        "admin",
                        new Date(),
                        null));
    }

    /**
     * 业务处理之后
     */
    @After("log()")
    public void doAfter() {
        System.out.println("after:业务处理之后");
    }

    /**
     * 获取返回值
     *
     * @param object
     */
    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        //logger.info("response={}",object);
    }

}
