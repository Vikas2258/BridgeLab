class Abst3{
	//Create an abstract class Shape with an abstract method area(). 
	//Derive classes Circle and Rectangle and implement the area() method.
	public static void main(String[] args){
		circle c = new circle();
		c.area();
		rectangle r = new rectangle();
		r.area();
		
	}
}
abstract class Shape{
	abstract void area();
}
class circle extends Shape{
	void area(){
		System.out.println("this is circle's area");
	}
}
class rectangle extends Shape{
	void area(){
		System.out.println("This is rectangle's area");
	}
}
	
 