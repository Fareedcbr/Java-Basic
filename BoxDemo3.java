//use to show how constructor works
//parameterized constructor
class Box {
    //these are local variableof class Box
    double width;
    double depth;
    double height;

    Box(double width, double height, double depth) {
        //there are instance variable of class Box
        //this is a constructor
        System.out.println("Constructor Box is called");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        
        Box mybox1 = new Box(10, 20, 15);

        double vol;
        // first box volume 
        vol = mybox1.volume();
        System.out.println("Volume of first box "+vol);

        Box mybox2 = new Box(3, 6, 9);
        //second box'x volume
        vol = mybox2.volume();
        System.out.println("Volume of second box : "+vol);

    }
    
}
