package cn.itdeer.common.api;

/**
 * 描述：Api异常
 * 创建人：Itdeer
 * 创建时间：2017/10/8 23:44
 */
public class ApiException extends RuntimeException{

    private Integer code;

    public ApiException(ApiResultEnum apiResultEnum) {
        super(apiResultEnum.getMessage());
        this.code = apiResultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
