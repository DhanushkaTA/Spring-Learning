package lk.tda.lifeCycle.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lk.tda.lifeCycle.bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Object created");
    }
}
