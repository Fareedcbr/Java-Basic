

class Box{
    double width;
    double depth;
    double height;

    // void volume() {
    //     System.out.println("Volume is :");
    //     System.out.println(width * height * depth);
    // }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}

public class BoxDemo {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;
        // mybox1.width = 10;
        // mybox1.height = 20;
        // mybox1.depth = 15;
        mybox1.setDim(10, 20, 15);


        // mybox2.width = 3;
        // mybox2.height = 6;
        // mybox2.depth = 9;
        mybox2.setDim(3, 6, 9);

        vol = mybox1.volume();
        System.out.println("Volume is 1 :" + vol);
        vol = mybox2.volume();
        System.out.println("Volume is 2 :" + vol);

        // compute volume of box
        // vol1 = mybox1.width * mybox1.height * mybox1.depth;
        // System.out.println("Volume is 1 :" + vol1);

        // vol2 = mybox2.width * mybox2.height * mybox2.depth;
        // System.out.println("Volume is 2 :" + vol2);
        mybox1.volume();
        mybox2.volume();
        
        // PS C:\Users\mdfar\OneDrive\Documents\GitHub> javac BoxDemo.java
        // PS C:\Users\mdfar\OneDrive\Documents\GitHub> java BoxDemo
        // Volume is 1 :3000.0
        // Volume is 2 :162.0
    }
}