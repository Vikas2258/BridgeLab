public class polymorphism1 {
public static void main(String[] args) {
    poly p = new poly();
    p.same();
    p.same(1);
    p.same(1,2);
    p.same("Vikas",10);
    p.same(1.99f,10);

    
}
}
class poly{
    void same(){
        System.out.println("this is first");
    }
    void same(int a){
        System.out.println("this is second");
    }
    void same(int a,int b){
        System.out.println("this is third");
    }
    void same(String c,int a){
        System.out.println("this is forth");
    }
    void same(float d,int a){
        System.out.println("this is fifth");
    }
}