package com.modernjava.defaults;

public class Client123 implements Interface1, Interface2, Interface3 {

    public void methodA() {

        System.out.println("Inside Method A: " + Client123.class);
    }

    // 1 -> class that implements the interface
    // 2 -> The Sub-Interface that extends the interface.

    static void main() {
        Client123 client123 = new Client123();
        client123.methodA();    //resolve to the child implementation
        client123.methodB();
        client123.methodC();
    }
}
