package lk.tda.configurations;

import lk.tda.configurations.config.AppConfig;
import lk.tda.configurations.config.AppConfigThree;
import lk.tda.configurations.config.AppConfigTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.registerShutdownHook();
        //Register Configuration class Way II
        ctx.register(AppConfig.class);
        ctx.refresh();
    }
}