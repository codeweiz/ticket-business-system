package com.microboat.tbs.orm.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * JPA 配置类
 * 
 * @author microboat
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.microboat.tbs.orm.repository")
@EntityScan(basePackages = "com.microboat.tbs.orm.entity")
public class JpaConfig {
    
}

