package lk.ijse.diWithSpring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Autowired
    Girl girl;

    public Boy() {
        System.out.println("Boy created");
    }

    public void chattingWithGirl(){
        System.out.println("From boy : "+this.girl);
        girl.chatting();
    }
}
