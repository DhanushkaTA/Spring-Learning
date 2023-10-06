package lk.tda.RunTimeValueInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
//    public SpringBeanOne() {
//        System.out.println("Bean Created");
//    }

    //Error :- UnsatisfiedDependencyException
    //Error creating bean with name 'springBeanOne' defined in file
    // \[D:\JAVA\GDSE 63\Testing Apps\Spring\_06_RunTimeValueInjection\target\classes\lk\tda\RunTimeValueInjection\bean\SpringBeanOne.class]:
    // Unsatisfied dependency expressed through constructor parameter 0; nested exception is
    // org.springframework.beans.factory.NoSuchBeanDefinitionException:
    // No qualifying bean of type 'java.lang.String' available: expected at least 1 bean which qualifies as autowire
    // candidate. Dependency annotations: {}
    public SpringBeanOne(@Value("Saman") String name) {
        System.out.println("Bean Created");
        System.out.println(name);
    }
    //@Value :- primitive DataType,String,Array


    //New Error :- .BeanCreationException
    // Error creating bean with name 'springBeanOne' defined in file
    // [D:\JAVA\GDSE 63\Testing Apps\Spring\_06_RunTimeValueInjection\target\classes\lk\tda\RunTimeValueInjection\bean\SpringBeanOne.class]:
    // Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException:
    // Failed to instantiate [lk.tda.RunTimeValueInjection.bean.SpringBeanOne]: No default constructor found;
    // nested exception is java.lang.NoSuchMethodException: lk.tda.RunTimeValueInjection.bean.SpringBeanOne.<init>()

    @Autowired
    public SpringBeanOne(@Value("Saman") String name,@Value("10000") int salary){
        System.out.println(name);
        System.out.println(salary);
    }


}