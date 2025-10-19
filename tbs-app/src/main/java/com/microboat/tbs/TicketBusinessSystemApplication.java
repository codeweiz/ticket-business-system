package com.microboat.tbs;

import com.microboat.tbs.common.config.TbsCommonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({
        TbsCommonConfiguration.class
})
@SpringBootApplication
public class TicketBusinessSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketBusinessSystemApplication.class, args);
    }

}
