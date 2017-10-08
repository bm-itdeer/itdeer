package cn.itdeer.common.exception;

/**
 * 描述：基础自定义异常
 * 创建人：Itdeer
 * 创建时间：2017/10/1 20:22
 */
public class BaseException extends RuntimeException{

    /** 状态*/
    private Integer code;

    /** 基础异常构造函数*/
    public BaseException(Integer code,String msg) {
        super(msg);
        this.code = code;
    }

    /** 获取状态码*/
    public Integer getCode() {
        return code;
    }

    /** 设置状态码*/
    public void setCode(Integer code) {
        this.code = code;
    }
}
