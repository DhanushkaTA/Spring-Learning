package lk.ijse.diWithSpring;

import lk.ijse.diWithSpring.bean.Boy;
import lk.ijse.diWithSpring.bean.GirlOne;
import lk.ijse.diWithSpring.config.AppConfig;
import lk.ijse.diWithSpring.di.Onali;
import lk.ijse.diWithSpring.di.Tharindu;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.registerShutdownHook();
        ctx.register(AppConfig.class);
        ctx.refresh();
        //Error creating bean with name 'boy': Unsatisfied dependency expressed through field 'goodGirl'; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'lk.ijse.diWithSpring.bean.GoodGirl' available: expected single matching bean but found 2: girlOne,girlTwo
        //No qualifying bean of type 'lk.ijse.diWithSpring.bean.GoodGirl' available: expected single matching bean but found 2: girlOne,girlTwo

        //When at @Primary in two same type class
        //Error creating bean with name 'boy': Unsatisfied dependency expressed through field 'goodGirl'; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'lk.ijse.diWithSpring.bean.GoodGirl' available: more than one 'primary' bean found among candidates: [girlOne, girlTwo]
        //No qualifying bean of type 'lk.ijse.diWithSpring.bean.GoodGirl' available: more than one 'primary' bean found among candidates: [girlOne, girlTwo]

//        Boy boy = ctx.getBean(Boy.class);
//        System.out.println(boy);
//        GirlOne girlOne = ctx.getBean(GirlOne.class);
//        System.out.println(girlOne);
//
//        boy.chatWithGirl();

        Tharindu tharindu = ctx.getBean(Tharindu.class);
        Onali onali = ctx.getBean(Onali.class);
        System.out.println(tharindu+" : "+onali);
        tharindu.chattingWithGirl();
    }
}