class Abst2{
	public static void main(String[] args){
		abc a = new abc();
		a.sleep();
		a.running();
		a.playing();
	}
	
}
interface Vikas{
	abstract void sleep();
	abstract void running();
	abstract void playing();
}
class abc implements Vikas{
	public void sleep(){
		System.out.println("I am sleeping");
		
	}
	public void running (){
		System.out.println("i am running");
	}
	public void playing (){
		System.out.println("i am playing");
	}
}

