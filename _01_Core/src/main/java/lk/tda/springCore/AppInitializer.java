package lk.tda.springCore;

import lk.tda.springCore.bean.SpringBean;
import lk.tda.springCore.bean.SpringBean2;
import lk.tda.springCore.bean.SpringBean3;
import lk.tda.springCore.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();

//        //Run Something just before JVM shutdown
//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Jvm is shutdown");
//                ctx.close();
//            }
//        }));

        ctx.registerShutdownHook();


        ctx.register(AppConfig.class);
        ctx.refresh();

        SpringBean bean = ctx.getBean(SpringBean.class);
        bean.testBean();
        System.out.println(bean);

        SpringBean2 bean2 = ctx.getBean(SpringBean2.class);
        System.out.println("SpringBean2 (bean2) : "+bean2);

        SpringBean3 bean3 = ctx.getBean(SpringBean3.class);
        System.out.println("SpringBean3 (bean3) : "+bean3);




    }

}
