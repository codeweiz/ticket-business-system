package com.microboat.tbs.orm;

import com.microboat.tbs.common.orm.config.TbsCommonOrmConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 测试应用
 *
 * @author microboat
 */
@Import({
        TbsCommonOrmConfiguration.class
})
@EnableJpaAuditing(auditorAwareRef = "defaultAuditorAware")
@SpringBootApplication
public class TestTbsOrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTbsOrmApplication.class, args);
    }
}
