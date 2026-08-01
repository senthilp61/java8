package com.modernjava.defaults;

public class Client14 implements Interface1, Interface4{

    public void methodA() {

        System.out.println("Inside Method A: " + Client14.class);
    }

    static void main() {

        Client14 client14 = new Client14();
        client14.methodA();
    }
}
