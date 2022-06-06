package homework.ArrayUtil;

public class ArrayUtil1Demo {
    public static void main(String[] args) {
        ArrayUtil1 au = new ArrayUtil1();
        int[] array = {1, 5, 0, 85, 14, 6, 2};

        int max = au.max(array);
        System.out.println(max);

        int min = au.min(array);
        System.out.println(min);

        au.even(array);
        System.out.println();

        au.odd(array);
        System.out.println();


        int average = au.arrayAverage(array);
        System.out.println(average);

        int sum = au.sumElement(array);
        System.out.println(sum);


        au.bubbleSort(array);
        System.out.println();

        au.bubbleSortReverse(array);
        System.out.println();

    }

}
