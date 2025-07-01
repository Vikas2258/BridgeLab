class over{
	public static void main(String[]args){
		over o = new over();
		o.same();
		o.same(5);
		o.same(10,5);
		
	}
	static void same(){
		System.out.println("this is empty");
	}
	static void same(int a){
		System.out.println("this is just a number " + a);
	}
	static void same(int a,int b){
		System.out.println("the sum of " +a +" " + b + " is" +a+b);
	}
}