package App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


import java.util.Properties;


//@EnableAutoConfiguration
//@ComponentScan("App.App.Controller")
//1.@EnableAutoConfiguration 自动配置 扫包范围默认当前类。
//2.加上扫包范围
//@EnableAsync   //开启异步调用
//@MapperScan(basePackages = {"App/Mapper"})//Mapper调用
@EnableEurekaServer
@SpringBootApplication
public class App{
        public static void main(String[] args) {
            SpringApplication.run(App.class, args);
        }
}
