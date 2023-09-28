package lk.tda.springCore;

import lk.tda.springCore.bean.SpringBean;
import lk.tda.springCore.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);

        System.out.println("1------------");

        ctx.refresh();

        System.out.println("2------------");

        SpringBean bean = ctx.getBean(SpringBean.class);
        bean.testBean();
        System.out.println(bean);

        ctx.close();
    }

}
