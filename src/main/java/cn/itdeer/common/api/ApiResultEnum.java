package cn.itdeer.common.api;

/**
 * 描述：状态码枚举
 * 创建人：Itdeer
 * 创建时间：2017/10/8 23:34
 */
public enum ApiResultEnum {

    UNKONW_ERROR(-1,"系统错误"),           //未知错误
    ERROR(0,"错误"),                    //错误
    SUCCESS(1,"成功"),                  //成功
    ;

    /** 状态码*/
    private Integer code;
    private String message;

    /** 状态码构造函数*/
    ApiResultEnum(Integer code,String message) {
        this.message = message;
        this.code = code;
    }

    /** 状态码获取方法*/
    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
