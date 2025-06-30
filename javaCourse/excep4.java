class excep4{
	static void checkNum(int Number){
			if(Number <0){
				throw new ArithmeticException("this is not a positive no.");
			}
			else{
				System.out.println("This is a valid no." + Number);
			}
		}
	public static void main(String[]args){
		checkNum(5);
	}
}
