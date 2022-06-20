package homework.dinamicarray;

public class DinamicArrayDemo {
    public static void main(String[] args) {
  DinamicArray din = new DinamicArray();
  din.add(8);
  din.add(7);
  din.add(4);
  din.add(47);
  din.add(2);
  din.add(215);
  din.add(9);
  din.add(46);
  din.add(20);
  din.add(5);
  din.add(36);
  din.add(72);
  din.add(1);
        System.out.println(din.isEmpty());
  din.printarray();
        System.out.println();
        System.out.println(din.getIndex(1));
        System.out.println();
        System.out.println(din.getFirstIndexByValue(9));
        din.set(10,14);
        System.out.println();
        din.add(5, 4);
        din.printarray();
    }
}
