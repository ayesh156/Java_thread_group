package com;

public class Test {
    public static void main(String[] args) {
        while (true) {
//            Thread.currentThread().stop();
            Thread.currentThread().suspend();
        }
    }
}
