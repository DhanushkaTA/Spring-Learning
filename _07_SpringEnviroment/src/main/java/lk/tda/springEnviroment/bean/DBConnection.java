package lk.tda.springEnviroment.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {

    @Autowired
    Environment environment;

    @Value("${user.db.url}")
    private String url;

    @Value("${user.db.username}")
    private String username;

    @Value("${user.db.password}")
    private String password;

    @Value("${user.db.driverClassName}")
    private String driverClassName;


    public DBConnection() {
        System.out.println("DBConnection Object Created");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(environment);

        String username1 = environment.getProperty("USERNAME");
        System.out.println(username1);

        //wrong key -> null output
        String username2 = environment.getProperty("USERNAMEe");
        System.out.println(username2);

        String os = environment.getRequiredProperty("os.name");
        System.out.println(os);

        //Wrong key -> Exception / BeanCreationException -> Required key 'os.names' not found
        String os1 = environment.getRequiredProperty("os.names");
        System.out.println(os1);

        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        System.out.println(driverClassName);
        System.out.println("+++++++++++++++++++++++++ \n");
    }
}
