class polym{
	public static void main(String[] args){
		overload o = new overload();
		o.maths();
		o.maths(2);
		o.maths("Vikas");
	}
}
class overload{
	void maths(){
		System.out.println("nothing");
	}
	void maths(int a){
		System.out.println(a + " is present");
	}
	void maths(String a){
		System.out.println(a + " is String");
	}
}