package com.microboat.tbs.common.config;

import com.microboat.tbs.common.orm.config.TbsCommonOrmConfiguration;
import com.microboat.tbs.common.redis.config.TbsCommonRedisConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 公共依赖配置类
 *
 * @author microboat
 */
@Import({
        TbsCommonOrmConfiguration.class,
        TbsCommonRedisConfiguration.class
})
@Configuration
public class TbsCommonConfiguration {
}
