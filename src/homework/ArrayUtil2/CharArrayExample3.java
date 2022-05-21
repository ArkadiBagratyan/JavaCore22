package homework.ArrayUtil2;

public class CharArrayExample3 {
    public static void main(String[] args) {
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        int x = chars3.length - 1;
        int y = chars3.length - 2;
        if (chars3[x] == 'y' && chars3[y] == 'l') {
            System.out.println("masiv@ ete verjanume l y uremn" + true);
        } else {
            System.out.println("ete chi verjanum l y ov ," + false);
        }
    }
}