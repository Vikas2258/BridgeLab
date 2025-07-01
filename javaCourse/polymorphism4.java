public class polymorphism4 {
    public static void main(String[] args) {
        science s = new science();
        s.lesson();
        
    }
}
class maths{
    void lesson(){
        System.out.println("this is maths");
    }
}
class science extends maths{
    void lesson(){
        System.out.println("This is science");
    }
}
