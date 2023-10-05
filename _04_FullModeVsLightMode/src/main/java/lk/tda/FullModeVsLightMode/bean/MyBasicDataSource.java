package lk.tda.FullModeVsLightMode.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBasicDataSource implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    MyConnection myConnection;

    public void setMyConnection(MyConnection myConnection){
        this.myConnection=myConnection;
    }

    public MyBasicDataSource() {
        System.out.println("MyBasicDataSource Object Created");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("MyBasicDataSource Bean Name Aware Call");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyBasicDataSource Bean Factory Aware Call");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyBasicDataSource Application Context Aware Call");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyBasicDataSource Ready to use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyBasicDataSource Destroyed");
    }
}
