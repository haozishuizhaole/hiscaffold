package cc.chenzhihao.hiscaffold.domain.base.entity;

import lombok.Data;

/**
 * 操作系统信息实体
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 20:06
 */
@Data
public class OperateSystemInfo {

    private String name;

    public OperateSystemInfo(String name) {
        this.name = name;
    }
}
