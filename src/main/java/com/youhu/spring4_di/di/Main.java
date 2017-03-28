package com.youhu.spring4_di.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: main
 * @Author:You.Hu
 * @Create:2017-03-11 16:52
 */
public class Main {
    public static void main (String [] args){
        //1.获取context上下文(作为Spring容器)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        //2.创建实例（注意并不是通过new的方式）
        UseDiService useDiService= context.getBean(UseDiService.class);

        System.out.println(useDiService.useDiFunction());
        context.close();
    }
}
