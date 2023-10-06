package lk.tda.configurations.bean;

import lk.tda.configurations.config.AppConfigThree;
import lk.tda.configurations.config.AppConfigTwo;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
//Register Configuration class Way II
@Import({AppConfigTwo.class, AppConfigThree.class})
public class MyBean {
    public MyBean() {
        System.out.println("My Bean Created");
    }
}
