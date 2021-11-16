package cc.chenzhihao.hiscaffold.infrastructure.repository.system;

/**
 * 系统监视器 接口
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 20:19
 */
public interface SystemMonitor {

    /**
     * 获取项目GroupID
     *
     * @return groupID
     */
    String projectGroupId();

    /**
     * 获取项目ArtifactId
     *
     * @return ArtifactId
     */
    String projectArtifactId();

    /**
     * 获取项目version
     *
     * @return version
     */
    String projectVersion();

    /**
     * 获取操作系统名称
     *
     * @return 操作系统名称
     */
    String operateSystemName();

}
