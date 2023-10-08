package lk.tda.SpringWebMVC.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("SpringBean Created");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware Called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware Called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware Called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean Ready to Use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroyed");
    }
}
