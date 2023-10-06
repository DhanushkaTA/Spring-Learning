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


    //Light Mode
    @Bean
    public MyBasicDataSource getMyBasicDataSource(){

        //MyConnection myConnection = new MyConnection(); Wrong
        //Inter Bean Dependency Invocation
        MyConnection myConnection = getMyConnection();
        MyConnection myConnection2 = getMyConnection();
        MyConnection myConnection3 = getMyConnection();
        System.out.println("myConnection 1 : "+myConnection);
        System.out.println("myConnection 1.2 : "+myConnection2);
        System.out.println("myConnection 1.3 : "+myConnection3);

        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(myConnection);
        return myBasicDataSource;
    }

    @Bean
    public MyConnection getMyConnection(){
        return new MyConnection();
    }

}