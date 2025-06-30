public class polymorphism3 {
    public static void main(String[] args) {
        Verma v = new Verma();
        v.same();
        
    }
}
class Vikas{
    void same(){
        System.out.println("this first class");
    }
}
class Verma extends Vikas{
    void same(){
        System.out.println("This is second class");
    }
}
