package com.company.java.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Computer computer = ctx.getBean(Computer.class);
        System.out.println("Задали CPU через класс: " + computer.getCpu().getVendor());

        CPU cpu = (CPU) ctx.getBean("intelCPU");
        System.out.println("Задали CPU по имени бина: " + cpu.getVendor());

        System.out.println("Cписок бинов: " + Arrays.toString(ctx.getBeanDefinitionNames()));
    }
}
