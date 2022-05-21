package homework.ArrayUtil;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = {56, 8, 3, -8, 0, 2, 6, 54, 2 , 13 };
        for (int i = 0; i < array.length; i++) {
           if(array[i] % 2 != 0){
               System.out.print(array[i]);
           }
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
           if(array[i] % 2  == 0 ) {
               count++;;
           }
        }
        System.out.println("tveri qanak zuyg-->" + count);


        }
    }



