package homework.lesson17;

public class A {
    int i,j;
    void showij(){
        System.out.println("i and j:" + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println(" i + j + k:" + (i + j + k)) ;
    }
}
class SimpleInheritance{
    public static void main(String[] args) {
        A superOB = new A();
        B subOB = new B();
        superOB.j = 10;
        superOB.j = 20;
        System.out.println("содержимое обьекта superOB: ");
        superOB.showij();
        System.out.println();

        subOB.i = 7;
        subOB.j = 8;
        subOB.k = 9;
        System.out.println("содержимое обьекта  subOb:");
        subOB.showij();
        subOB.showk();
        System.out.println();
        System.out.println(" сумма i,j,k в обьекте subOB:");
        subOB.sum();

    }
}