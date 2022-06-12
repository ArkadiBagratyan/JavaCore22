package homework.artagruthyun.lesson14;

public class VarArgs4 {
    static void vaTest(int... v) {
        System.out.print(" vaTest(int ...):" +
                " количество аргументов: " +
                v.length + " содержимое");
        for (int x : v) {
            System.out.print(x + " ");

        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ...)"
                + " количество аргументов "
                + v.length + " содержимое");


        for (boolean x : v) {
            System.out.print(x + " ");
            System.out.println();
        }


    }


    public static void main(String[] args) {
        vaTest(1, 2, 3);//верно!
        vaTest(true, false, false);//верно!
        vaTest(); // ошибка: неоднозначность1
    }
}
