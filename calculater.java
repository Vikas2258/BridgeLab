public class calculater {
    public static void main(String[] args) {
        good g = new good();
        g.add(5,5);
        g.sub(5,5);
        g.multi(1,2);
        g.div(2,2);
        
    }
    
}
class good{
     void add(int a , int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);
    }
    void multi(int a,int b){
        System.out.println(a*b);
    }
    void div(int a,int b){
        System.out.println(a/b);
    }
}
