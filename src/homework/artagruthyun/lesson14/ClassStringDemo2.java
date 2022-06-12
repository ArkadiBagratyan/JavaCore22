package homework.artagruthyun.lesson14;

public class ClassStringDemo2 {
    public static void main(String[] args) {
        String strob1 = "первая строка";
        String strob2 = "втарая строка ";
        String strob3 = strob1;

        System.out.println(" erkarutyun@ strob1 " + strob1.length());
        System.out.println("3 rd simvoli indeqs@ " + " strokum skrob1 : " + strob1.charAt(3));

        if (strob1.equals(strob2)) {
        System.out.println("strob 1 = strob2");
        } else System.out.println("strob 1 != strob2");

        if (strob1.equals(strob3)) {
            System.out.println("strob1 = strob3");
        }else System.out.println("strob1 != strob3");

    }
}

