package lk.ijse.diWithSpring.di;

import org.springframework.stereotype.Component;

@Component
public class Onali implements GoodGirl{

    public Onali() {
        System.out.println("Onali created");
    }

    @Override
    public void chat(){
        System.out.println("Onali chatting");
    }
}
