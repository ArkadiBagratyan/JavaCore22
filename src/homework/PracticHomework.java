package homework;

public class PracticHomework {
    long convert(int minuts) {
        return minuts * 60;
    }

    int nextNumber(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    boolean LessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        }
        return false;

    }
    boolean reverseBool(boolean value){
        if( value == true ){
            return false;
        }
        return true;
    }
    int maxLenght(int[] array1,int [] array2){
        if( array1.length > array2.length ) {
            return array1.length;
        }
        return array2.length;
    }


}
