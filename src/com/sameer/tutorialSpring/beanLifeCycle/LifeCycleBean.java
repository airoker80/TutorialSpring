package com.sameer.tutorialSpring.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by Sameer on 2/5/2018.
 */
public class LifeCycleBean{
    String message;

    public void getMessage() {
        System.out.println("THIS BEAN IS "+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("Initialization of bean");
    }

    public void destroy(){
        System.out.println("Disposal of bean");
    }
}
