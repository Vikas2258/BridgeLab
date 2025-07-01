public class polymorphism2 {
    public static void main(String[] args){
        maths m = new maths();
        m.print();
        m.print(959);
        m.print(10,20);
        m.print("Vikas","Verma");
        m.print(1.9f,1.1f);

    }
}
class maths{
    void print(){
        System.out.println("nothing is their");
    }
    void print(int a){
        System.out.println(a);
    }
    void print(int a,int b){
        System.out.println(a+b);
    }
    void print(String a,String b){
        System.out.println(a + b);
    }
    void print(float a , float b){
        System.out.println(a + b);
    }
}