package cc.chenzhihao.hiscaffold.api;

import cc.chenzhihao.hi.framework.common.api.ResultEnum;

/**
 * 错误码
 *
 * @author jacksonchenzhihao
 * @date 2021-12-31 13:50
 */
public enum ErrorCode implements ResultEnum {
    /**
     * 通用错误码
     */
    SUCCESS(0, "success"),
    FAILED(1, "operation failed"),
    ;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 错误码
     */
    private final int code;

    /**
     * 错误描述
     */
    private final String msg;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
