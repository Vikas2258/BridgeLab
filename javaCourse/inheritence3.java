public class inheritence3 {
    public static void main(String[] args) {
        me m = new me();
        
    }
}
class parent{
    //creating a constructor.
    public parent(){
        System.out.println("he is may father");
    }
}
class me extends parent{
    public me(){
        super();
        System.out.println("she is my mother");
    }
}