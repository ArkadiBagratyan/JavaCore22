package homework;

public class PracticHomeworkDemo {
    public static void main(String[] args) {
        PracticHomework pm = new PracticHomework();

        long second = pm.convert(50);
        {
            System.out.println(second);
        }
        int number = pm.nextNumber(8);
        {
            System.out.println(number);
        }
        boolean art = pm.isSameNum(4 , 8);
        System.out.println(art);

        boolean tt = pm.LessThanOrEqualToZero(-2);
        System.out.println(tt);

        boolean pop = pm.reverseBool(true);
        System.out.println(pop);


        int [] array1 = new int[75];
        int [] array2 = new int[485];
        int maxLenght = pm.maxLenght(array1,array2);
        System.out.println(maxLenght);


    }


}
