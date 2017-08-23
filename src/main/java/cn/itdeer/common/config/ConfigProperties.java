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
     *获取 后太-系统-PageSize
     */
    @Value("${admin.system.page.size}")
    private int SystemPagesize;


    public int getSystemPagesize() {
        return SystemPagesize;
    }


}
