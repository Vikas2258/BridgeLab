class Abst9{
	//Create an abstract class Appliance with method turnOn() and turnOff().
	//Extend it to Fan and Light
	public static void main(String[] args){
		Fan f = new Fan();
		Light l = new Light();
		f.turnOff();
		f.turnOn();
		l.turnOff();
		l.turnOn();
	}
}
abstract class Appliance{
	abstract void turnOn();
	abstract void turnOff();
}
class Fan extends Appliance{
	void turnOn(){
		System.out.println("this is running fan");
	}
	void turnOff(){
		System.out.println("this is still fan");
	}
}
class Light extends Appliance{
	void turnOn(){
		System.out.println("This light is on");
	}
	void turnOff(){
		System.out.println("this light is off");
	}
}
