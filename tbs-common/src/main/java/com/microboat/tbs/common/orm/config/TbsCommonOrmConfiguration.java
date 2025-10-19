package com.microboat.tbs.common.orm.config;

import com.microboat.tbs.common.orm.aware.DefaultAuditorAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Orm 配置类
 *
 * @author microboat
 */
@Configuration
public class TbsCommonOrmConfiguration {

    /**
     * 默认审计提供者
     *
     */
    @Bean
    public DefaultAuditorAware defaultAuditorAware() {
        return new DefaultAuditorAware();
    }
}
