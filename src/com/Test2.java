package com;

public class Test2 {
    public static void main(String[] args) {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();
        
        ThreadGroup group = new ThreadGroup("ABC");
        
        Thread t1 = new Thread(group, "My Thread-1");
        
        System.out.println(t1);
    }
}
