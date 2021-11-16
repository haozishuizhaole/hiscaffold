package cc.chenzhihao.hiscaffold.bootstrap.component;

import cc.chenzhihao.hiscaffold.infrastructure.repository.system.SystemMonitor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 系统监视器
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 19:42
 */
@Data
@Component
public class DefaultSystemMonitor implements SystemMonitor {

    private static final String SYS_PRO_OS_NAME = "os.name";

    @Value("${system.project.groupId}")
    private String projectGroupId;

    @Value("${system.project.artifactId}")
    private String projectArtifactId;

    @Value("${system.project.version}")
    private String projectVersion;

    @Override
    public String projectGroupId() {
        return this.projectGroupId;
    }

    @Override
    public String projectArtifactId() {
        return this.projectArtifactId;
    }

    @Override
    public String projectVersion() {
        return this.projectVersion;
    }

    @Override
    public String operateSystemName() {
        return System.getProperty(SYS_PRO_OS_NAME);
    }
}
