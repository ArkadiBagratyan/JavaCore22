package homework.ArrayUtil;

public class ArrayUtil1 {


    int max(int[] array) {
        int maxIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxIndex) {
                maxIndex = array[i];
            }
        }
        return maxIndex;
    }

    int min(int[] array) {
        int minIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minIndex) ;
            {
                minIndex = array[i];
            }

        }
        return minIndex;
    }

    void even(int[] array) {
        int evenIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenIndex++;
                System.out.print(array[i] + " ");
            }

        }
    }

    void odd(int[] array) {
        int oddIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddIndex++;
                System.out.print(array[i] + " ");
            }

        }
    }

    int arrayAverage(int[] array) {
        int lt = 0;
        int pt = 0;
        for (int i = 0; i < array.length; i++) {
            lt += array[i];
            pt++;

        }
        return lt / pt;
    }


    int sumElement(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a = a + array[i];
        }
        return a;
    }

    void bubbleSort(int[] array) {
        int zip = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    zip = array[i];
                    array[i] = array[j];
                    array[j] = zip;
                }

            }
            System.out.print(array[i] + " ");

        }
    }

    void bubbleSortReverse(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array [i]>array[j]){
                    count = array[i];
                    array[i] = array[j];
                    array [j] = count;
                }
            }
            System.out.print(array[i] + " ");

        }

    }

}
