class Abst6{
	//Create an abstract class Vehicle with an abstract method move(). 
	//Implement it in classes Car and Bike.

	public static void main(String[] args){
		Car c = new Car();
		Bike b = new Bike();
		c.move();
		b.move();
		
		
	}
}
interface Vehicle {
	abstract void move();
}
class Car implements Vehicle{
	public void move(){
		System.out.println("this is a car");
	}
}
class Bike implements Vehicle{
	public void move(){
		System.out.println("This is a bike");
	}
}