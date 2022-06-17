package homework.lesson17a;

public class A {
    A() {
        System.out.println(" в конструкторе A. ");
    }
}

class B extends A {
    B() {
        System.out.println("в конструктое  B. ");

    }
}
class C extends B {
    C(){
        System.out.println(" в конструкторе C");

    }
}
 class CallinCons {
     public static void main(String[] args) {
         C c = new C();
     }


 }