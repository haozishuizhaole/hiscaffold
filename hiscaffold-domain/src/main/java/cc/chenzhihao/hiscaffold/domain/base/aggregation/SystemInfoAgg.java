package cc.chenzhihao.hiscaffold.domain.base.aggregation;

import cc.chenzhihao.hiscaffold.domain.base.entity.OperateSystemInfo;
import cc.chenzhihao.hiscaffold.domain.base.entity.ProjectInfo;
import lombok.Data;

/**
 * 系统信息 聚合
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 19:49
 */
@Data
public class SystemInfoAgg {

    /**
     * 项目信息（聚合根）
     */
    private ProjectInfo projectInfo;

    /**
     * 操作系统信息
     */
    private OperateSystemInfo operateSystemInfo;

    public SystemInfoAgg(ProjectInfo projectInfo, OperateSystemInfo operateSystemInfo) {
        this.projectInfo = projectInfo;
        this.operateSystemInfo = operateSystemInfo;
    }
}
