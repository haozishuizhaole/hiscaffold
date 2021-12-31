package com.domain.hiscaffold.infrastructure.external.uuid;

import com.domain.hiscaffold.domain.base.infrastructure.external.IDGenerateService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * ID生成器 实现
 *
 * @author domain
 * @date 2021-12-31 13:40
 */
@Service
public class IDGenerateServiceImpl implements IDGenerateService {

    @Override
    public String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
