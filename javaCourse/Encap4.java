//Write a class Car with private fields model and speed. 
//Add validation in the setter so that speed cannot be negative. Show its use in the main method.
class Encap4{
	public static void main(String[] args){
		car c = new car();
		c.setSpeed(-100);
		c.setmodel("BMW");
		System.out.println("This is model of car " + c.getmodel());
		System.out.println("This is the speed of car " + c.getSpeed());
		
		
	}
}
class car {
	private String model;
	private int Speed;
	public String getmodel(){
		return model;
	}
	public int getSpeed(){
		return Speed;
	}
	public void setmodel(String model){
		this.model = model;
	}
	public void setSpeed(int Speed){
		if(Speed > 0){
			this.Speed = Speed;
		}
		else{
			this.Speed = 0;
		}
	}
}
