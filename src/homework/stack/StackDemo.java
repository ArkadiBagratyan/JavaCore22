package homework.stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack myStacke = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            myStacke.push(i);


        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);

        }
        System.out.println("content in myStack ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStacke.pop());

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());

        }

    }

}

