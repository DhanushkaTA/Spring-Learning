package lk.ijse.diWithSpring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Boy implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    @Qualifier("girlOne")
    @Autowired
    GoodGirl goodGirl;
    //Girl girl;

    public Boy() {
        System.out.println("Boy created");
    }

    public void chatWithGirl(){
        System.out.println("From boy : "+this.goodGirl);
        goodGirl.chatting();
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Boy Bean name aware call");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Boy BeanFactory aware call");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Boy Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Boy Bean Ready to use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Boy Bean Destroyed");
    }
}
