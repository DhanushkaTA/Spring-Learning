package lk.tda.FullModeVsLightMode;

import lk.tda.FullModeVsLightMode.bean.MyConnection;
import lk.tda.FullModeVsLightMode.bean.SpringBeanTwo;
import lk.tda.FullModeVsLightMode.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.registerShutdownHook();
        ctx.register(AppConfig.class);
        ctx.refresh();

//        SpringBeanTwo bean = ctx.getBean(SpringBeanTwo.class);
//        System.out.println("2 :- "+bean);

        //Context Invocation
        MyConnection myConnection = ctx.getBean(MyConnection.class);
        System.out.println("myConnection 2 : "+myConnection);
    }
}