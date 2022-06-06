package homework.bracechacker;

import homework.stack.Stack;

public class BraceChacker {
    private final String text;
    private final Stack stack = new Stack();

    BraceChacker(String text) {
        this.text = text;

    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);

            }
            char chack;
            switch (c) {
                case ')':
                    chack = (char) stack.pop();
                    if (chack == '{' || chack == '[') {
                        System.out.println("opened " + chack + "but closed" + c + "in index " + i);
                    }
                    break;

                case ']':
                    chack = (char) stack.pop();
                    if (chack == '(' || chack == '{') {
                        System.out.println(" opened" + chack + " but closed" + c + "in index" + i);
                    }
                    break;

                case '}':
                    chack = (char) stack.pop();
                    if (chack == '(' || chack == '[') {
                        System.out.println(("opened" + chack + " but closed" + c + " in index" + i));
                    }
                    break;

            }

        }
        char last;
        while ((last = (char) stack.pop()) != 0) {
            System.out.println("error opened" + last + " but not closed ");

        }

    }

}
