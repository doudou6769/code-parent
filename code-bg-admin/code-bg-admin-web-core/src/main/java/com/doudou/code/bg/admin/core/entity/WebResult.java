package com.doudou.code.bg.admin.core.entity;

import java.util.Date;

/**
 * @author DouDou
 * @date 2020/10/6
 * @Description 统一返回格式对象
 */
public class WebResult {

    /**
     * 返回的错误码
     */
    private Integer code;

    /**
     * 返回的错误信息
     */
    private String msg;

    /**
     * 返回的json数据
     */
    private Object obj;

    /**
     * 返回的时间
     */
    private long timestamp;

    public WebResult() {
    }

    public WebResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.timestamp = new Date().getTime();
    }

    public WebResult(Integer code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
        this.timestamp = new Date().getTime();
    }

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

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
