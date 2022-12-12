package org.kira.lean.web.bean.common;

/**
 * @author: Zhang Chaoqing
 * @date: 2022/12/10 22:43
 */
public class CommonResp<T> {

    private static final String SUCCESS_MESSAGE = "success";
    private static final String FAIL_MESSAGE = "fail";
    private static final Integer SUCCESS_CODE = 200;
    private static final Integer FAIL_CODE = 500;

    private Integer code;
    private String message;
    private T data;
    private Long count;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public CommonResp(Integer code, String message, T data, Long count) {
        this.count = count;
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public CommonResp(Integer code, String message, T data) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public CommonResp(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


    public CommonResp(T data, Long count) {
        this.count = count;
        this.data = data;
        this.code = SUCCESS_CODE;
        this.message = SUCCESS_MESSAGE;
    }


    public static <T> CommonResp<T> success() {
        return new CommonResp<T>(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static <T> CommonResp<T> fail() {
        return new CommonResp<T>(FAIL_CODE, FAIL_MESSAGE);
    }

    public static <T> CommonResp<T> success(T data) {
        return new CommonResp<T>(SUCCESS_CODE, SUCCESS_MESSAGE, data);
    }

    public static <T> CommonResp<T> success(T data, Long count) {
        return new CommonResp<T>(SUCCESS_CODE, SUCCESS_MESSAGE, data, count);
    }
}