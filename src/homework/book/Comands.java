package homework.book;

public interface Comands {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_BOOK = 2;
    int PRINT_BOOK_BY_AFTER_NAME=3;
    int PRINT_BOOK_BY_GENRE = 4;
    int PRINT_BOOK_BY_RANGE_PRICE = 5;
    int ADD_AFTER = 6;
    int PRINT_AFTER = 7;

    static void printcommand (){
        System.out.println("inpuit " + EXIT + "for exit") ;
        System.out.println("input" + ADD_BOOK + " for add.book");
        System.out.println("input" + PRINT_BOOK + " for print book");
        System.out.println("input" + PRINT_BOOK_BY_AFTER_NAME +" for print book by after name " );
        System.out.println(" input " + PRINT_BOOK_BY_GENRE + " for print book by genre");
        System.out.println("intpu " + PRINT_BOOK_BY_RANGE_PRICE + " for print book by range price");
        System.out.println("input " + ADD_AFTER + "  for add after");
        System.out.println("input " + PRINT_AFTER + " for print after");


    }

}
