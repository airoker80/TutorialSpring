package com.sameer.tutorialSpring.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.lang.Nullable;

/**
 * Created by Sameer on 2/5/2018.
 */

public class InitiLifeCycle implements BeanPostProcessor {

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("The bean is "+beanName + " before intialization");

        return null;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("The bean is " + beanName + " after initialization");
        return null;
    }
}
