package com.microboat.tbs.common.config;

import com.microboat.tbs.common.redis.config.RedisConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 公共依赖配置类
 *
 * @author microboat
 */
@Import({
        RedisConfig.class
})
@Configuration
public class TbsCommonConfiguration {
}
