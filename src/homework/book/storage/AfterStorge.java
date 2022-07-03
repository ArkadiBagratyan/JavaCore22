package homework.book.storage;

import homework.book.models.After;

public class AfterStorge extends After {

    private After[] array = new After[10];
    private int size = 0;

    public void add(After value) {
        if (size == array.length) {
            After[] tmp = new After[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];

            }
            array = tmp;


        }
        array[size++] = value;


    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i]);


        }

    }
}
