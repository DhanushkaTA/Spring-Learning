package lk.tda.configurations.config;

import lk.tda.configurations.bean.A;
import lk.tda.configurations.bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigTwo {
    @Bean
    public A getA(){
        return new A();
    }

    @Bean
    public B getB(){
        return new B();
    }
}
