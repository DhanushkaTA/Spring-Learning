package lk.tda.RunTimeValueInjection.bean;

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
}