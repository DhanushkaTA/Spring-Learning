package lk.tda.FullModeVsLightMode.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanTwo() {
        System.out.println("Spring Bean Two Created");
    }

    public void setBeanName(String s) {
        System.out.println("Spring Bean Two Bean Name Aware Call");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean Two Bean Factory Aware Call");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean Two Application Context Aware Call");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean Two Ready to use");
    }

    public void destroy() throws Exception {
        System.out.println("Spring Bean Two Destroyed");
    }
}
