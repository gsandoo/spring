package com.example.iocspring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


//
@Component
public class ApplicationContextProvider implements ApplicationContextAware { // 상속받아
    private  static  ApplicationContext context; //

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public  static ApplicationContext getContext(){
        return context;
    }
}
