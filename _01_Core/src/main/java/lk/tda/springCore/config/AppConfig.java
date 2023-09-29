package lk.tda.springCore.config;

import lk.tda.springCore.bean.MyConnection;
import lk.tda.springCore.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;


//Bean definitions walta source ekak
//How to scan beans and how to enter to the application context
@Configuration
//@ComponentScan(basePackageClasses = {SpringBean.class})
@ComponentScan(basePackages = "lk.tda.springCore.bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig object created");
    }

    @Bean
    public MyConnection getConnection(){
        return new MyConnection();
    }

    @Bean("MyDate")
    public Date getDate(){
        return new Date();
    }
}
