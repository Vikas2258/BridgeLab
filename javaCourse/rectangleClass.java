public class rectangleClass {
    //Create a Rectangle class with width and height attributes. 
    //Add a method to calculate the area. Create objects and find the area.
    private double w;
    private double h;
    public rectangleClass(double w, double h){
        this.w = w;
        this.h = h;
    }
    public double area(){
        return w*h;
    }
    public static void main(String[] args) {
        rectangleClass r = new rectangleClass(4, 10);
        System.out.println(r.area());
    }
}