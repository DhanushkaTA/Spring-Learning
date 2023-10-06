package lk.tda.springEnviroment.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.tda.springEnviroment.bean")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
