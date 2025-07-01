public class inheritance1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makesound();
    }
    
}
class Animal{
    void makesound(){
        System.out.println("Animals can make sound");
    }
}
class Dog extends Animal{
    void makesound(){
        System.out.println("Dog's can bark");
    }
}