package com.weisean.util;

import com.weisean.entity.ResultMsg;
import com.weisean.constant.ErrorCode;

public class ResultUtil {

    public static ResultMsg newBizFailMsg(String m) {
        return new ResultMsg().setC(ErrorCode.BIZ_FAIL).setM(m).setD("");
    }

    public static ResultMsg newSuccessMsg() {
        return new ResultMsg().setC(ErrorCode.OK).setM("请求成功").setD("");
    }

    public static ResultMsg newParamEmptyMsg() {
        return new ResultMsg().setC(ErrorCode.PARAM_EMPTY).setM("参数不能为空").setD("");
    }

    public static ResultMsg newInterfaceDisabledMsg() {
        return new ResultMsg().setC(ErrorCode.INTERFACE_DISABLED).setM("接口已废弃").setD("");
    }

    public static ResultMsg newServerErrorMsg() {
        return new ResultMsg().setC(ErrorCode.SERVER_ERROR).setM("服务器报错，请联系管理员").setD("");
    }

    public static ResultMsg newTimeoutMsg() {
        return new ResultMsg().setC(ErrorCode.TIMEOUT).setM("会话超时，请重新登录").setD("");
    }

    public static ResultMsg newNoAuthorizationMsg() {
        return new ResultMsg().setC(ErrorCode.NO_AUTHORIZATION).setM("无权访问").setD("");
    }

}
