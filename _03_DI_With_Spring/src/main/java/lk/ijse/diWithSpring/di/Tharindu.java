package lk.ijse.diWithSpring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tharindu implements Di{

    // Property Injection
//    @Autowired
    GoodGirl goodGirl;

    public Tharindu() {
    }

    //Constructor Injection
//    @Autowired
//    public Tharindu(GoodGirl goodGirl) {
//        this.goodGirl=goodGirl;
//    }

    public void chattingWithGirl(){
        goodGirl.chat();
    }

    //Setter method injection
    @Autowired
    @Override
    public void setGoodGirl(GoodGirl goodGirl) {
        this.goodGirl=goodGirl;
    }
}
