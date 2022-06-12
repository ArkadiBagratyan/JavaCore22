package homework.artagruthyun.lesson14;

public class VarArgs2 {
    static void vaTest(String msg , int ...v){
        System.out.println(msg + v.length + " Содержимое");

        for(int x : v) {
            System.out.print(x + " ");
        }
            System.out.println();

        }

    public static void main(String[] args) {
        vaTest("  один параметр переменной длины: " , 10);
        vaTest( "три параметр переменной длины: ", 1 , 2 , 3);
        vaTest(",без параметр переменной длины: ");
    }
    }
