class Abst{
	public static void main(String[]args){
		abc a=new abc();
		a.sleep();
		a.ask();
		
	}
}
abstract class Vikas{
	void sleep(){
		
		System.out.println("Hi I am sleepping");
	}
	abstract void ask();
}
class abc extends Vikas{
	void ask(){
		System.out.println("I am asking for something");
	}
}