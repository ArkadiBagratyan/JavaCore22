package homework.book.storage;

import homework.book.models.Book;

public class BookStorage extends Book {

    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book value) {
        if (size == array.length) {
            Book[] tmp = new Book[array.length + 10];
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

    public void printbookbyaftername(String after) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getAfter().equals(after)) {
                System.out.println(array[i]);
                count++;


            }


        }
        if (count == 0) {
            System.out.println("invalid book after");
        }
    }

    public void printbookgenre(String genre) {
        int pin = 0;
        for (int i = 0; i <size; i++) {
            if (array[i].getAfter().equals(genre)){
                System.out.println(array[i]);

            }

        }
        if(pin == 0){
            System.out.println("invalide code ");
        }
    }

    public void bookpricerange(double price, double price2) {
        int count  = 0;
        for (int i = 0; i <size ; i++) {
            if (array[i].getPrice()<= price2 &&  array[i].getPrice() >= price){
                System.out.println(array[i]);
            }

        }
        if (count == 0){
            System.out.println("invalid price code");

        }
    }
}