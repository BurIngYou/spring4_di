package com.youhu.spring4_di.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: main
 * @Author:You.Hu
 * @Create:2017-03-11 16:52
 */
public class Main {
    public static void main (String [] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseDiService useDiService= context.getBean(UseDiService.class);
        System.out.println(useDiService.useDiFunction());
        context.close();
    }
}
