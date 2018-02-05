package nuonuo.jskp.common.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class CardResponse<T> implements Serializable {

    @JSONField(ordinal = 1)
    private String code;

    @JSONField(ordinal = 2)
    private String message;

    @JSONField(ordinal = 3)
    private T data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        int len = builder.length();
        if (code != null && code.trim().length() > 0) {
            builder.append("\"code\":\"" + code + "\",");
        }
        if (message != null && message.trim().length() > 0) {
            builder.append("\"message\":\"" + message + "\",");
        }

        if (data != null) {
            builder.append("\"data\":" + data + ",");
        }

        if (builder.length() > len) {
            builder.deleteCharAt(builder.length() - 1);
        }
        builder.append("}");
        return builder.toString();
    }
}
