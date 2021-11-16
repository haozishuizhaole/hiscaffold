package cc.chenzhihao.hiscaffold.service.system;

import cc.chenzhihao.hiscaffold.domain.base.aggregation.SystemInfoAgg;
import cc.chenzhihao.hiscaffold.domain.base.repository.SystemRepository;
import cc.chenzhihao.hiscaffold.service.system.convertor.SystemAssembler;
import cc.chenzhihao.hiscaffold.service.system.dto.SystemInfoDTO;
import org.springframework.stereotype.Service;

/**
 * 系统 service
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 20:36
 */
@Service
public class SystemService {

    private final SystemRepository systemRepository;

    public SystemService(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }

    /**
     * 获取系统信息
     *
     * @return 系统信息
     */
    public SystemInfoDTO getSystemInfo() {
        SystemInfoAgg systemInfo = systemRepository.getSystemInfo();
        return SystemAssembler.systemInfoAgg2SystemInfoDTO(systemInfo);
    }
}
