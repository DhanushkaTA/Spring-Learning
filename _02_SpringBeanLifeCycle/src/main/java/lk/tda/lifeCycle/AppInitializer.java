package lk.tda.lifeCycle;

import lk.tda.lifeCycle.bean.SpringBean;
import lk.tda.lifeCycle.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.registerShutdownHook();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SpringBean bean = ctx.getBean(SpringBean.class);
        SpringBean bean2 = ctx.getBean(SpringBean.class);
        System.out.println(bean);
        System.out.println(bean2);
//        for(int i=0;i<10;i++){
//            SpringBean bean = ctx.getBean(SpringBean.class);
//            System.out.println(bean);
//        }
    }

}
