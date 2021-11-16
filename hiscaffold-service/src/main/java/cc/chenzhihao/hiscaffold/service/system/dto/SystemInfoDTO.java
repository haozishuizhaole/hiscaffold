package cc.chenzhihao.hiscaffold.service.system.dto;

import lombok.Data;

/**
 * 系统信息
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 20:45
 */
@Data
public class SystemInfoDTO {

    /**
     * 项目信息
     */
    private ProjectInfoDTO projectInfo;

    /**
     * 操作系统信息
     */
    private OperateSystemInfoDTO operateSystemInfo;

}
