package lk.tda.FullModeVsLightMode.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public MyConnection() {
        System.out.println("MyConnection Object created");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("MyConnection Bean Name Aware Call");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyConnection Bean Factory Aware Call");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyConnection Application Context Aware Call");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection Ready to use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection Destroyed");
    }
}
