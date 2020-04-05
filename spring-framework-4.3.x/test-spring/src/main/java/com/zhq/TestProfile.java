package com.zhq;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author : ZHQ
 * @date : 2020/4/4
 */
public class TestProfile {

    public static void main(String[] args) {
        System.setProperty("spring.active.profile", "test");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                        "${spring.active.profile}-beans.xml");

        TestBean zhq = (TestBean) context.getBean("zhq");
        zhq.test();

        ConfigurableEnvironment environment = context.getEnvironment();
        System.out.println(environment.getProperty("spring.active.profile"));
        System.out.println(environment.getProperty("M2_HOME"));
    }
}
