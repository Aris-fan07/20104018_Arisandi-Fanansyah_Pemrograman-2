package com.arisandif.pbo.modul7.Percobaan;

public class Overload {
    void myOverload (A a){
        System.out.println("Overload.myOverload(A a)");
    }

    void myOverload (B a){
        System.out.println("Overload.myOverload(B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        A a = new A();
        C c = new C();

        o.myOverload(a);
        o.myOverload(c);
    }
}
