package cn.itdeer.common.base;

/**
 * 说明： 系统-消息-提示
 * 创建人：Itdeer
 * 创建时间：2017-08-23 上午9:18.
 */
public class BaseMessage {

    private String title;
    private String message;
    private String type; //success info warning error

    public BaseMessage() {
    }

    public BaseMessage(String title, String message, String type) {
        this.title = title;
        this.message = message;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
