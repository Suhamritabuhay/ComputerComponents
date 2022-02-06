package com.company.java.spring.xml;

public class StaticCPUFactory {
    public static CPU createCPU(String name) {
        if ("intel".equalsIgnoreCase(name)) {
            return new IntelCpu();
        } else if ("amd".equalsIgnoreCase(name)) {
            return new AmdCpu();
        }
        return () -> "Default";
    }
}
