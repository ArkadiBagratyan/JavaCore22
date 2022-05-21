
package homework.ArrayUtil2;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;

        for (int i = 0; i < 7; i++) {
            if (chars[i] == c) {
                count++;

            }
        }
        System.out.println(" c simvol@ " + count);
        System.out.println();
    }


}

