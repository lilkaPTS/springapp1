package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //обращение к файлу ресурсов апликейшен контекст и помещает все бины описанные в контекст
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBean("testBean", TestBean.class).getName());
        context.close();
    }
}
