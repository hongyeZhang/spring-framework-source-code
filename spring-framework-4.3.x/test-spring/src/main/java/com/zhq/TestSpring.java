package com.zhq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : ZHQ
 * @date : 2020/4/4
 */
public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(ctx.getId());
        TestBean tb = ctx.getBean(TestBean.class);
        tb.test();
    }
}
