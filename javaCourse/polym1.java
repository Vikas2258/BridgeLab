class polym1{
	public static void main(String[] args){
		cars c = new cars();
		c.brand();
		
	}
}
class bike{
	void brand(){
		System.out.println("BMW");
	}
}
class cars extends bike{
	void brand(){
		System.out.println("Pagani");
	}
}
