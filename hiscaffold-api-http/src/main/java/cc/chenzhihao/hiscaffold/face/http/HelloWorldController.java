package cc.chenzhihao.hiscaffold.face.http;

import cc.chenzhihao.hi.framework.common.api.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld 控制器
 *
 * @author jacksonchenzhihao
 * @date 2021-12-30 17:44
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public Result<String> hello() {
        return Result.success("Hello World!");
    }


}
