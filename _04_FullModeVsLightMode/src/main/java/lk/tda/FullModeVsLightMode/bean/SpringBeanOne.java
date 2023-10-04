package lk.tda.FullModeVsLightMode.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne() {
        System.out.println("Spring Bean One Created");
    }

    public void setBeanName(String s) {
        System.out.println("Spring Bean One Bean Name Aware Call");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean One Bean Factory Aware Call");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean One Application Context Aware Call");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean One Ready to use");
    }

    public void destroy() throws Exception {
        System.out.println("Spring Bean One Destroyed");
    }
}
