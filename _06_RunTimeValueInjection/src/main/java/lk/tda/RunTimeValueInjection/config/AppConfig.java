package lk.tda.RunTimeValueInjection.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.tda.RunTimeValueInjection.bean")
public class AppConfig {
}
