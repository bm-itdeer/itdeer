package cn.itdeer.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 描述：配置-属性-工具类
 * 创建人：Itdeer
 * 创建时间：2017/8/20 22:59
 */

@Component
public class ConfigProperties {

    /**
     *获取 后台-系统-PageSize
     */
    @Value("${admin.system.page.size}")
    private int SystemPagesize;
    public int getSystemPagesize() {
        return SystemPagesize;
    }

    /**
     * 获取 日志类型 字典
     */
    @Value("${dict.logs.type}")
    private String DictLogsType;
    public String getDictLogsType(){
        return DictLogsType;
    }

    /**
     * 获取 日志级别 字典
     */
    @Value("${dict.logs.level}")
    private String DictLogsLevel;
    public String getDictLogsLevel(){
        return DictLogsLevel;
    }


}
