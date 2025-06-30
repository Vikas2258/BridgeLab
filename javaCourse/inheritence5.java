public class inheritence5 {
    //Create a class LivingThing, then subclass Animal, and then subclass Bird. 
    //Each class should have a method describe(). Call describe() from a Bird object.
    public static void main(String[] args){
        Bird b = new Bird();
        b.describe();

    }

}
class LivingThing{
    void describe(){
        System.out.println("this is living class");

    }

}
class Animal extends LivingThing{
    void describe(){
        System.out.println("this is Animal class");
    }

}
class Bird extends Animal{
    void describe(){
        System.out.println("this is bird class");
    }

}