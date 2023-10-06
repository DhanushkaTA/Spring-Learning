package lk.tda.springEnviroment.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//06_RunTimeValueInjection
@Component
public class MyBean implements InitializingBean {
    @Value("Thairndu")
    String name;

    @Value("24")
    int age;

    @Value("Sri Lanka")
    String country;

    @Value("Java,JS,MySql,CSS,HTML")
    String skille[];

    public MyBean() {
        System.out.println("MyBean Created");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
        System.out.println(age);
        System.out.println(country);
        for (String s:skille){
            System.out.println(s);
        }
    }
}
