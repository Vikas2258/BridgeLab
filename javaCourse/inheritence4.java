public class inheritence4 {
    public static void main(String[] args){
        car c = new car();
        c.speed();
    }
    //Create a class Vehicle with a speed variable and a method displaySpeed().
    // Derive a class Car that has a speed variable too. Use super.speed and this.
    //speed to print both values.

}
class veh{
    int s = 100;
}
class car extends veh{
    int s = 200;
    void speed(){
        System.out.println("This is the speed of class veh " + this.s);
        System.out.println("This is the speed of class car " + super.s);
    }
}
