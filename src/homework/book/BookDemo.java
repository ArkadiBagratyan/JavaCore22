package homework.book;

import homework.book.models.After;
import homework.book.models.Book;
import homework.book.storage.AfterStorge;
import homework.book.storage.BookStorage;


import java.util.Scanner;


public class BookDemo implements Comands {

    private static Scanner scanner = new Scanner(System.in);

    private static BookStorage bookStorage = new BookStorage();
    private static AfterStorge afterStorage = new AfterStorge();


    public static void main(String[] args) {
        After poxos = new After("Artur", "Vardanyan" , " arturvardanyan@mail.ru","male");
        After varduhi = new After("Varduhi", "Vardanyan" , " varduhivardanyan@mail.ru","female");
        afterStorage.add(poxos);
        afterStorage.add(varduhi);

        bookStorage.add(new Book("Samvel", poxos, 100, 25, "Drama"));
        bookStorage.add(new Book("AREV", poxos, 50, 225, "Drama"));
        bookStorage.add(new Book("hamakargich", varduhi, 522, 14, "sarsap"));

        boolean run = true;
        while (run) {
            Comands.printcommand();
            int commands = Integer.parseInt(scanner.nextLine());

            switch (commands) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOK:
                    bookStorage.print();
                    break;
                case PRINT_BOOK_BY_AFTER_NAME:
                    printbookafter();
                    break;
                    
                case PRINT_BOOK_BY_GENRE:
                    printbookgenre();
                    break;
                case PRINT_BOOK_BY_RANGE_PRICE:
                    printbyrangeprice();
                    break;
                case ADD_AFTER:
                    addafter();
                    break;
                case PRINT_AFTER:
                    afterStorage.print();

            }
        }

    }

    private static After addafter() {
        System.out.println(" input after name");
        String aftername = scanner.nextLine();
        System.out.println(" input after surname");
        String surname = scanner.nextLine();
        System.out.println(" imput email after");
        String email = scanner.nextLine();
        System.out.println("choso after gender 1 - male 2 -female");
        String gender = String.valueOf(scanner.nextLine().charAt(0));
        if (Integer.parseInt(gender) == 1) {
            gender = "male";

        } else if (Integer.parseInt(gender) == 2) {
            gender = "female";
        }
        After afterobj = new After(aftername, surname, email, gender);
        afterStorage.add(afterobj);
        return afterobj;
    }

    private static void printbyrangeprice() {
        System.out.println("print book by range price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("print book by range next price");
        double price2 = Double.parseDouble(scanner.nextLine());
        bookStorage.bookpricerange(price, price2);
    }

    private static void printbookgenre() {
        System.out.println("input book by genre");
        String genre = scanner.nextLine();
        bookStorage.printbookgenre(genre);
    }

    private static void printbookafter() {
        System.out.println(" input after name");
        String after = scanner.nextLine();
        bookStorage.printbookbyaftername(after);
    }

    private static void addBook() {
        System.out.println("input book title ");
        String title = scanner.nextLine();
        After addnewafter =addafter();

        System.out.println(" input book price ");
        String strprice = scanner.nextLine();
        System.out.println(" input book count");
        String strcount = scanner.nextLine();
        System.out.println(" input book genre");
        String genre = scanner.nextLine();


        double price = Double.parseDouble(strprice);
        int count = Integer.parseInt(strcount);

        Book book = new Book(title,addnewafter, price, count, genre);
        bookStorage.add(book);


    }


}
