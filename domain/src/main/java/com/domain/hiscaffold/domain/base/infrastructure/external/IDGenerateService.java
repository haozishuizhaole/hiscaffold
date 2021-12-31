package com.domain.hiscaffold.domain.base.infrastructure.external;

/**
 * ID生成器
 *
 * @author domain
 * @date 2021-12-31 13:36
 */
public interface IDGenerateService {

    /**
     * 生成UUID
     *
     * @return UUID
     */
    String generateUUID();

}
