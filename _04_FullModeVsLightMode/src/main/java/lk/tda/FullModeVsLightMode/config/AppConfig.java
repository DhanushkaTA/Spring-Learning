package lk.tda.FullModeVsLightMode.config;

import lk.tda.FullModeVsLightMode.bean.SpringBeanOne;
import lk.tda.FullModeVsLightMode.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.tda.FullModeVsLightMode.bean")
public class AppConfig {

//    @Bean
//    public SpringBeanOne getSpringBeanOne(){
//        //Inter Bean Dependency
//        SpringBeanTwo springBeanTwo1 = this.getSpringBeanTwo();
//        SpringBeanTwo springBeanTwo2 = this.getSpringBeanTwo();
//        System.out.println("1 : "+springBeanTwo1);
//        System.out.println("2 : "+springBeanTwo2);
//
//        return new SpringBeanOne();
//    }

    @Bean
    public SpringBeanOne getSpringBeanOne(SpringBeanTwo springBeanTwo){
        //Inter Bean Dependency
        System.out.println("1 : "+springBeanTwo);

        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getSpringBeanTwo(){
        return new SpringBeanTwo();
    }
}