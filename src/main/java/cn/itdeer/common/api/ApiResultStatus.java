package cn.itdeer.common.api;

/**
 * 描述：API返回的结果集状态工具类
 * 创建人：Itdeer
 * 创建时间：2017/10/8 23:15
 */
public class ApiResultStatus {

    /** 成功状态*/
    public static ApiResult success(Object object){
        ApiResult result = new ApiResult();
        result.setCode(1);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    /** 成功状态*/
    public static ApiResult success(){
        return success(null);
    }

    /** 错误状态*/
    public static ApiResult error(Integer code,String msg){
        ApiResult result = new ApiResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
