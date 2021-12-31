package cc.chenzhihao.hiscaffold.bootstrap;

import cc.chenzhihao.hi.framework.spring.enable.EnableSpringBeanContext;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cc.chenzhihao.hiscaffold")
@MapperScan(basePackages = "cc.chenzhihao.hiscaffold.infrastructure.repository.persistent.mapper")
@EnableSpringBeanContext
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
