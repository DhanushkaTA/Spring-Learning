package lk.tda.FullModeVsLightMode.config;

import lk.tda.FullModeVsLightMode.bean.SpringBeanOne;
import lk.tda.FullModeVsLightMode.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.tda.FullModeVsLightMode.bean")
public class AppConfig {

    @Bean
    public SpringBeanOne getSpringBeanOne(){
        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getSpringBeanTwo(){
        return new SpringBeanTwo();
    }
}
