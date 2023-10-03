package lk.ijse.diWithSpring;

import lk.ijse.diWithSpring.bean.Boy;
import lk.ijse.diWithSpring.bean.Girl;
import lk.ijse.diWithSpring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.registerShutdownHook();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Boy boy = ctx.getBean(Boy.class);
        System.out.println(boy);
        Girl girl = ctx.getBean(Girl.class);
        System.out.println(girl);

        boy.chatWithGirl();
    }
}