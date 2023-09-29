package lk.tda.lifeCycle.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean Created");
    }
}
