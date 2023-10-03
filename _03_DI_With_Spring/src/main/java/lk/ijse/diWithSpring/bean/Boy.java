package lk.ijse.diWithSpring.bean;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public Boy() {
        System.out.println("Boy created");
    }

    public void chattingWithGirl(){
        Girl girl=new Girl();
        girl.chatting();
    }
}
