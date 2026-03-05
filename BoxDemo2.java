//use to show how constructor works
//default constructor
class Box {
    double width;
    double depth;
    double height;

    Box() {
        //this is a constructor
        System.out.println("Constructor Box is called");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo2 {
    public static void main(String[] args) {
        
        Box mybox1 = new Box();

        double vol;
        // first box volume 
        vol = mybox1.volume();
        System.out.println("Volume of first box "+vol);

        Box mybox2 = new Box();
        //second box'x volume
        vol = mybox2.volume();
        System.out.println("Volume of second box : "+vol);

    }
    
}
