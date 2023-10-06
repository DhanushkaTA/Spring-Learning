package lk.tda.SpringWebMVC.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//AppConfig -> WebAppConfig
@Configuration
@ComponentScan(basePackages = "lk.tda.SpringWebMVC.bean")
@EnableWebMvc
public class WebAppConfig {

}
