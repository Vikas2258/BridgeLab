class polymorphism6{
	public static void main(String[] args){
		calculate c = new calculate();
		c.maths();
		c.maths(10);
		c.maths(2,10);
		
	}
}
class calculate{
	
	void maths(){
		System.out.println("Here is nothing");
	}
	void maths(int a){
		System.out.println("this is first integer " + a);
	}
	void maths(int a,int b){
		System.out.println("these are two variable " +a + " " + b);
	}
}