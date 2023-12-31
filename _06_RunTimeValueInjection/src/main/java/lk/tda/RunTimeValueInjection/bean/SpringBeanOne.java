package lk.tda.RunTimeValueInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class SpringBeanOne {
//    public SpringBeanOne() {
//        System.out.println("Bean Created");
//    }

    //Error (I) :- UnsatisfiedDependencyException
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


    //New Error(II) :- .BeanCreationException
    // Error creating bean with name 'springBeanOne' defined in file
    // [D:\JAVA\GDSE 63\Testing Apps\Spring\_06_RunTimeValueInjection\target\classes\lk\tda\RunTimeValueInjection\bean\SpringBeanOne.class]:
    // Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException:
    // Failed to instantiate [lk.tda.RunTimeValueInjection.bean.SpringBeanOne]: No default constructor found;
    // nested exception is java.lang.NoSuchMethodException: lk.tda.RunTimeValueInjection.bean.SpringBeanOne.<init>()

    @Autowired(required = false)
    public SpringBeanOne(@Value("Saman") String name,@Value("10000") int salary){
        System.out.println(name);
        System.out.println(salary);
    }


    //New Error(III) :- .BeanCreationException
    //Error creating bean with name 'springBeanOne': Invalid autowire-marked constructor:
    // public lk.tda.RunTimeValueInjection.bean.SpringBeanOne(java.lang.String[],int,boolean). Found constructor with
    // 'required' Autowired annotation already:
    // public lk.tda.RunTimeValueInjection.bean.SpringBeanOne(java.lang.String,int)

    @Autowired(required = false)
    public SpringBeanOne(@Value("Saman,Kamal,Nimal") String names[],@Value("25") int age,@Value("true") boolean b){
        for (String name : names){
            System.out.println(name);
        }
        System.out.println(age);
        System.out.println(b);
    }
    //When add @Autowired(required = false) the run constructor with higher number of parameter

    @Autowired(required = false)
    public SpringBeanOne(@Value("Saman,Kamal,Nimal") String names[],@Value("25,30,40,50") int ages[],@Value("true") boolean b){
        for (String name : names){
            System.out.println(name);
        }
        for (int age : ages){
            System.out.println(age);
        }
        System.out.println(b);
    }


}