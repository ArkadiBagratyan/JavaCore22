package homework.lesson17;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
         Box plainbox = new Box();
         double vol;
         vol = weightbox.volume();
        System.out.println(" обьем weightbox = " + vol);
        System.out.println(" вес weightbox = " + weightbox.weight);
        System.out.println();
        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println( " объем playinbox =" + vol);
//        System.out.println("вес plainbox = " + plainbox.weight);
        // ошибка кода
    }
}
