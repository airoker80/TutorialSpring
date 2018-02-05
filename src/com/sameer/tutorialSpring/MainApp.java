package com.sameer.tutorialSpring;

import com.sameer.tutorialSpring.DI.SetterDI.TextEditor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sameer on 2/5/2018.
 */
public class MainApp {
    public static void main(String args[]) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

 /*       HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("is well recived");
        obj.getMessage();

        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        helloWorld.getMessage();*/


 /*life Cycle
         LifeCycleBean lifeCycleBean = (LifeCycleBean)context.getBean("initDestroy");
        lifeCycleBean.setMessage("LIFE CYCLE BEAN");

        lifeCycleBean.getMessage();
        context.registerShutdownHook();
*/

 /*Constructor DI*/

//        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
//        textEditor.checkSpell();

        /*Setter DI*/

        TextEditor te = (TextEditor) context.getBean("editor");
        te.spellCheck();


    }
}
