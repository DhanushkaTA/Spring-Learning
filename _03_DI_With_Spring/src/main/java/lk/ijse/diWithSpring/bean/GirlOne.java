package lk.ijse.diWithSpring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class GirlOne implements GoodGirl,BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public GirlOne() {
        System.out.println("Girl One created "+this);
    }

    @Override
    public void chatting(){
        System.out.println("Girl One Chatting");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl One BeanFactory aware call");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Girl One Bean Name Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl One Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl One Bean Ready to use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl One Bean Destroyed");
    }
}
