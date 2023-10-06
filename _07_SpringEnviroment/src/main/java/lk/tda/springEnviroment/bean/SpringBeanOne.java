package lk.tda.springEnviroment.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {

    @Value("${USERNAME}")
    String username;

    @Value("${os.name}")
    String os;

    public SpringBeanOne() {
        System.out.println("SpringBean Object Created");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("username : "+username);
        System.out.println("os : "+os);
    }
}