package com.company.java.spring.xml;

public class Computer {
    private CPU cpu;

    //для инициализации через constructor-arg в beans.xml
    public Computer(CPU cpu) {
        this.cpu = cpu;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
