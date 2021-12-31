package cc.chenzhihao.hiscaffold.service.implement.id;

import cc.chenzhihao.hi.framework.core.context.BeanContextHolder;
import cc.chenzhihao.hiscaffold.domain.base.infrastructure.external.IDGenerateService;
import cc.chenzhihao.hiscaffold.service.interfaces.id.IDService;
import org.springframework.stereotype.Service;

/**
 * ID 业务接口实现
 *
 * @author jacksonchenzhihao
 * @date 2021-12-31 13:58
 */
@Service
public class IDServiceImpl implements IDService {

    @Override
    public String generateUUID() {
        IDGenerateService idGenerator = BeanContextHolder.getBean(IDGenerateService.class);
        return idGenerator.generateUUID();
    }
}
