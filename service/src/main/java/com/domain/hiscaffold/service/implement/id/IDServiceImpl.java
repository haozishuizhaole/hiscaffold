package com.domain.hiscaffold.service.implement.id;

import cc.chenzhihao.hi.framework.core.context.BeanContextHolder;
import com.domain.hiscaffold.domain.base.infrastructure.external.IDGenerateService;
import com.domain.hiscaffold.service.interfaces.id.IDService;
import org.springframework.stereotype.Service;

/**
 * ID 业务接口实现
 *
 * @author domain
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
