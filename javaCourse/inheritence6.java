public class inheritence6 {
    //Create a class Shape with method draw().
    //Subclass it as Circle and Square,each overriding draw().
    //Use a Shape reference to call the method on both subclasses.
    public static void main(String[] args){
        shape s = new Circle();
        shape n = new Square();
        s.draw();
        n.draw();
    }
}
class shape{
    void draw(){
        System.out.println("this is shape class");
    }

}
class Circle extends shape{
    void draw(){
        System.out.println("this is Circle class");
    }

}
class Square extends shape{
    void draw(){
        System.out.println("this is Square class");
    }

}