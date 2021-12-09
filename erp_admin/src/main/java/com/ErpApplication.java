package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/* Springboot多模块启动时，总是找不到子模块的bean，这是因为启动 Application 中总是默认扫描当前项目的目录，而不会去扫描子项目的bean，所以这里找不到。
        一个解决思路是，在启动Application 上注明要去扫描哪些。
        比如子项目是：com.base, 当前项目是：com.access, 那就加上：@ComponentScan(basePackages = {"com.base", "com.access"}) */
@ComponentScan(basePackages = {"com.erp"})
public class ErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpApplication.class, args);
    }

}
