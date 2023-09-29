package lk.tda.springCore;

import lk.tda.springCore.bean.*;
import lk.tda.springCore.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

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

//        SpringBean springBean = (SpringBean) ctx.getBean("SpringBean");
//        System.out.println(springBean);//No bean named 'SpringBean' available

        //SpringBean -> springBean (Default)
        SpringBean springBean = (SpringBean) ctx.getBean("springBean");
        System.out.println(springBean);

        //SPringBean4 -> SPringBean4
        SPringBean4 sPringBean4 = (SPringBean4) ctx.getBean("SPringBean4");
        System.out.println(sPringBean4);

        //SpringBean2 -> BeanTwo
        //We can change default bean id if we want
        SpringBean2 springBean2= (SpringBean2) ctx.getBean("BeanTwo");
        System.out.println(springBean2);

        MyConnection myConnection = ctx.getBean(MyConnection.class);
        System.out.println("MyConnection : "+myConnection);

        // MyConnection -> myConnection -> X //No bean named 'myConnection' available
        // MyConnection -> MyConnection -> X //No bean named 'MyConnection' available
        // MyConnection -> getConnection (Default)
        MyConnection myConnection1= (MyConnection) ctx.getBean("getConnection");
        System.out.println(myConnection1);

        //Use @Bean("MyDate")
        Date bean1 = (Date) ctx.getBean("MyDate");
        System.out.println(bean1);

    }

}
