package cn.itdeer.common.exception;

import java.io.IOException;

/**
 * 描述：系统异常
 * 创建人：Itdeer
 * 创建时间：2017/9/7 0:13
 */
public class SystemException extends Exception{
    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, IOException e) {
        super(message,e);
    }
}
