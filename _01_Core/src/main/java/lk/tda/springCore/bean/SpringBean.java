package lk.tda.springCore.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring bean object created");
    }

    public void testBean(){
        System.out.println("Spring bean working...");
    }
}
