package cc.chenzhihao.hiscaffold.face.http;

import cc.chenzhihao.hi.framework.common.api.Result;
import cc.chenzhihao.hiscaffold.api.ErrorCode;
import cc.chenzhihao.hiscaffold.service.interfaces.id.IDService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ID 控制器
 *
 * @author jacksonchenzhihao
 * @date 2021-12-30 17:44
 */
@RestController
public class IDController {

    @Resource
    private IDService idService;

    @RequestMapping("/uuid")
    public Result<String> uuid() {
        return Result.custom(ErrorCode.SUCCESS, idService.generateUUID());
    }

}
