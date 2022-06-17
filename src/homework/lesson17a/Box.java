package homework.lesson17a;

public class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }
 Box(){
        width = -1;
        height = -1;
        depth = -1;

 }
 Box(double len){
        width = height = depth  = len;
 }
 double volume(){
        return width * height * depth;
 }
}
class Boxweight extends Box{
    double weight;

    Boxweight(Boxweight ob){
        super(ob);
        weight = ob.weight;

    }
    Boxweight(double w,  double h, double d, double m  ){
        super (w,h,d);
        weight = m;

    }
    Boxweight(){
        super();
        weight = -1;

    }
    Boxweight(double len , double m){
        super(len);
        weight = m;

    }
}
class DemoSuper {
    public static void main(String[] args) {
       Boxweight mybox1 = new Boxweight(10,20,15,34.3);
       Boxweight mybox2 = new Boxweight(2,3,4,0.076);
       Boxweight mybox3 = new Boxweight();
       Boxweight mycube = new Boxweight(3,2);
       Boxweight myclone = new Boxweight(mybox1);
       double vol;

       vol = mybox1.volume();
        System.out.println("объем mybox1 = " + vol);
        System.out.println(" вес mybox1 = " +mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("объем  mybox2 =" + vol) ;
        System.out.println(" вес  mybox2  = " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println(" объем  mybox 3 = " + vol);
        System.out.println(" вес  mybox 3   = " +  mybox3.weight );
        System.out.println();

        vol = myclone.volume();
        System.out.println("объем  myclone = " + vol);
        System.out.println("вес myclone = " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println(" объем  mycube = " + vol);
        System.out.println(" вес  mycube = " + mycube.weight);
        System.out.println();
    }
}