public class ObjectClassIntro {
    public static void main(String[] args){
        //Vikas v = new Vikas();
        //Neeraj n = new Neeraj();
        // v.run();
        // n.sir();
        Vikas.run();
        Neeraj.sir();
    }
}
class Vikas{
   public static void run(){
    System.out.println("Hi Vikas");
   }
}
class Neeraj{
    public static void sir(){
        System.out.println("Neeraj is a teacher");
    }
}
