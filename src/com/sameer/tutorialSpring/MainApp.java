package com.sameer.tutorialSpring;

import com.sameer.tutorialSpring.Setup.HelloWorld;
import com.sameer.tutorialSpring.beanLifeCycle.LifeCycleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sameer on 2/5/2018.
 */
public class MainApp {
    public static void main(String args[]){
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

 /*       HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("is well recived");
        obj.getMessage();

        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        helloWorld.getMessage();*/

        LifeCycleBean lifeCycleBean = (LifeCycleBean)context.getBean("initDestroy");
        lifeCycleBean.setMessage("LIFE CYCLE BEAN");

        lifeCycleBean.getMessage();
        context.registerShutdownHook();

    }
}
