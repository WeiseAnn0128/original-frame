package com.weisean.entity;

import com.alibaba.fastjson.JSON;

public class ResultMsg {

    private String c;
    private String m;
    private Object d;

    public String getC() {
        return c;
    }

    public ResultMsg setC(String c) {
        this.c = c;
        return this;
    }

    public String getM() {
        return m;
    }

    public ResultMsg setM(String m) {
        this.m = m;
        return this;
    }

    public Object getD() {
        return d;
    }

    public ResultMsg setD(Object d) {
        this.d = JSON.parse(JSON.toJSONString(d));
        return this;
    }
}
