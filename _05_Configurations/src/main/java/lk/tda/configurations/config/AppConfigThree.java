package lk.tda.configurations.config;

import lk.tda.configurations.bean.C;
import lk.tda.configurations.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigThree {

    @Bean
    public C getC(){
        return new C();
    }

    @Bean
    public D getD(){
        return new D();
    }
}
