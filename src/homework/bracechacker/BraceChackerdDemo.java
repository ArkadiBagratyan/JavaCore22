package homework.bracechacker;

public class BraceChackerdDemo {
    public static void main(String[] args) {
        String text = "hello ( Java {  [  ";
        BraceChacker br = new BraceChacker(text);
        br.check();

    }
}
