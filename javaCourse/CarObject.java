
public class CarObject {
    public static void main(String[] args){
       Car c = new Car();
       c.brand();
       c.model();
       c.year();

    }
}
class Car{
    void model(){
        System.out.println("M5");
    }
    void brand(){
        System.out.println("BMW");
    }
    void year(){
        System.out.println("2023");
    }
}