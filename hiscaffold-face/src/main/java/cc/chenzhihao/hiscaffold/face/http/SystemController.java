package cc.chenzhihao.hiscaffold.face.http;

import cc.chenzhihao.hi.framework.common.api.Result;
import cc.chenzhihao.hiscaffold.service.system.SystemService;
import cc.chenzhihao.hiscaffold.service.system.dto.SystemInfoDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 系统 API
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 21:06
 */
@RestController
public class SystemController {

    @Resource
    private SystemService systemService;

    @RequestMapping("/system")
    public Result<SystemInfoDTO> getSystemInfo() {
        return Result.success(systemService.getSystemInfo());
    }

}
