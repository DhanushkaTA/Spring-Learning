package lk.tda.SpringWebMVC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//AppConfig -> WebAppConfig
@Configuration
@ComponentScan(basePackages = {"lk.tda.SpringWebMVC.bean","lk.tda.SpringWebMVC.controller"})
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {

    //if controller class return nothing exception
    //When Controller class return 'index' ->       1) .../views/index        2) .../views/index.html
    //When Controller class return 'controller' ->  1) .../views/controller   2) .../views/index.html
    @Bean
    public ViewResolver viewResolver(){//set ViewResolver to context
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/views/");//1
        viewResolver.setSuffix(".html");//2
        viewResolver.setOrder(2);
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/views/**").addResourceLocations("/views/");
    }
}