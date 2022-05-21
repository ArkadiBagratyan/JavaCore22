package homework.lesson7;

public class Figure3 {
    public static void main(String[] args) {
        char c = 'o';
        int count = 0;
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        for (int i = 0; i < 7; i++) {
            if (chars[i] == c) {
                count++;
            }

        }
        System.out.println(count);

        int sum = 0;
        int[] number = {1, 2, 1, 100, 20, 9};

        for (int i = 0; i <= 5; i++) {
            sum = sum + number[i];
        }
        System.out.println(sum);


    }

}
