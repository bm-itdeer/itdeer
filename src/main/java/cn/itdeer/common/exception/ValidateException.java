package cn.itdeer.common.exception;

/**
 * 描述：验证异常
 * 创建人：Itdeer
 * 创建时间：2017/9/7 0:07
 */
public class ValidateException extends Exception{
    public ValidateException() {
        super();
    }

    public ValidateException(String message) {
        super(message);
    }

    public ValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidateException(Throwable cause) {
        super(cause);
    }

    protected ValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
