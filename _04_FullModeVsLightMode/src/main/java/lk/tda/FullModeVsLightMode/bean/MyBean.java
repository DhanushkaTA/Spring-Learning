package lk.tda.FullModeVsLightMode.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public MyBean() {
        System.out.println("MyBean Object Created");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("MyBean Bean Name Aware Call");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyBean Bean Factory Aware Call");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyBean Application Context Aware Call");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyBean Ready to use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyBean Destroyed");
    }




}