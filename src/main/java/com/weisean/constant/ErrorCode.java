package com.weisean.constant;

import java.util.Arrays;
import java.util.List;

public class ErrorCode {

	public static final String OK = "0"; // 请求成功
	public static final String PARAM_EMPTY = "10001"; //参数为空
	public static final String PARAM_FORMAT_ERROR = "10002"; //参数格式错误
	public static final String BIZ_FAIL = "10003"; //业务流程处理失败，前端可将返回参数m提示给用户（message）
	public static final String INTERFACE_DISABLED = "10004"; //接口已废弃，前端可提示更新，否则当前功能不可用
	public static final String REQUEST_URL_NOT_EXIST = "10005"; //请求地址不存在
	public static final String SERVER_ERROR = "10006"; //服务器报错
	public static final String TIMEOUT = "10007"; //会话超时
	public static final String NO_AUTHORIZATION = "10008"; //无权访问
	public static final String REQUEST_METHOD_NOT_ALLOWED = "10009"; //请求方式不被允许
	public static final String YES = "Y";
	public static final String NO = "N";
	public static final List<String> YES_OR_NO_LIST = Arrays.asList(YES, NO);

}
