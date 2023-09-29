package lk.tda.springCore.bean;

import org.springframework.stereotype.Component;

@Component("BeanTwo")
public class SpringBean2 {
    public SpringBean2() {
        System.out.println("SpringBean2 Created");
        System.out.println("SpringBean2 : "+this);
    }
}
