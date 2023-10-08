package lk.tda.RestController.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//AppConfig -> WebAppConfig
@Configuration
@ComponentScan(basePackages = {"lk.tda.RestController.bean","lk.tda.RestController.controller"})
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {

}