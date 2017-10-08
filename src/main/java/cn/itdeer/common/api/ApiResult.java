package cn.itdeer.common.api;

/**
 * 描述：API返回的结果集
 * 创建人：Itdeer
 * 创建时间：2017/10/8 22:44
 */
public class ApiResult<T> {

    private Integer code;       //状态码
    private String msg;         //提示信息
    private T data;             //内容

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
