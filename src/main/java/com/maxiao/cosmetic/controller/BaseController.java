package com.maxiao.cosmetic.controller;

import com.maxiao.cosmetic.domain.response.ResponseEntity;

import java.util.Collections;

public class BaseController {

    private static final int RESCODE_OK = 200;

    private static final int RESCODE_FAIL = 201;

    protected ResponseEntity getFailResult(String msg) {
        return this.getFailResult(RESCODE_FAIL, msg);
    }

    protected ResponseEntity getFailResult(int errCode, String msg) {
        return new ResponseEntity("fail", errCode, msg, Collections.EMPTY_MAP);
    }

    protected <T> ResponseEntity getSuccessResult(T obj) {
        return new ResponseEntity<T>("ok", RESCODE_OK, "操作成功", obj);
    }
}
