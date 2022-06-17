package homework.lesson17b;

import jdk.swing.interop.SwingInterOpUtils;

public class A {
    void callme() {
        System.out.println("в метод callme() из класса A");
    }
}

class B extends A {
    @Override
    void callme() {
        System.out.println("  в метод callme()  из класса B");
    }
}

class C extends A {
    void callme() {
        System.out.println(" в метод callme () из класса C");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r; // получить ссылку на объект типа A
        r = a;// переменная r ссылается на объект типа A
        r.callme();// вызывать вариант метода callme(),
        // определенный в классе A
        r = b;     // переменная r ссылается на объект типа B
        r.callme(); // вызывать вариант метода callme(),
        // определенный в классе B

        r = c;     // переменная r ссылается на объект типа C
        r.callme();// вызывать вариант метода callme(),
        // определенный в классе C
    }
}