package com.maxiao.cosmetic.domain.exception;

/**
 * Created by sunyu on 2017/8/4.
 */
public class CosmeticException extends Exception{

    private static final long serialVersionUID = -6202759931628287239L;
    private static final int DEFAULT_ERROR_CODE = 201;


    /* 错误码,用于返回接口code */
    private int errCode;

    public CosmeticException(){
        super();
    }

    public CosmeticException(String msg) {
        super(msg);
        this.errCode = DEFAULT_ERROR_CODE;
    }
    public CosmeticException(int errCode, String msg) {
        super(msg);
        this.errCode = errCode;
    }

    public CosmeticException(String msg, Throwable e) {
        super(msg,e);
        this.errCode = DEFAULT_ERROR_CODE;
    }

    public CosmeticException(int errCode, String msg, Throwable e) {
        super(msg, e);
        this.errCode = errCode;
    }


    public int getErrCode() {
        return errCode;
    }
}
