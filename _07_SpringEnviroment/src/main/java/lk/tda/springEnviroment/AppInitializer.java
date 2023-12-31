package lk.tda.springEnviroment;

import lk.tda.springEnviroment.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.registerShutdownHook();
        ctx.register(AppConfig.class);
        ctx.refresh();

        System.out.println("+++++++++++++++++++++++++++");
/**
        //Get System Environment Variables
        Map<String, String> getenv = System.getenv();
        for (String key :
                getenv.keySet()) {
            System.out.println(key+" : "+getenv.get(key));
        }

        System.out.println("===========================");

        //Get Java Property's
        Properties properties = System.getProperties();
        for (Object key :
                properties.keySet()) {
            System.out.println(key+" : "+properties.get(key));
        }
 */
    }
}