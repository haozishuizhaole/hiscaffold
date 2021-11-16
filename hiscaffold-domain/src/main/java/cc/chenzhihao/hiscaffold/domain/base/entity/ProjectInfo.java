package cc.chenzhihao.hiscaffold.domain.base.entity;

import lombok.Data;

/**
 * 项目信息实体
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 19:33
 */
@Data
public class ProjectInfo {

    private String groupId;

    private String artifactId;

    private String version;

    public ProjectInfo(String groupId, String artifactId, String version) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
    }
}
