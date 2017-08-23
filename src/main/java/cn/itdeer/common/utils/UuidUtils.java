package cn.itdeer.common.utils;

import java.util.UUID;

/**
 * 描述：生成UUID的工具类
 * 创建人：Itdeer
 * 创建时间：2017/8/23 23:46
 */
public class UuidUtils {

    /**
     * 随机生成32位的字符串
     * @return
     */
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
