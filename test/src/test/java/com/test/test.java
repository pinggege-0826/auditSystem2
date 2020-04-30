package com.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    private ClassPathXmlApplicationContext app = null;

        @Before
        @Test
        public void before(){
            app = new ClassPathXmlApplicationContext("employee.xml");
        }
}
