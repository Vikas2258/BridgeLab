class excep1{
	//Create a program that attempts to call a method on a null object 
	//and handle the NullPointerException gracefully.

	public static void main(String[] args){
		excep1 x = new excep1();
			
		try{
			x.len();

		}catch(NullPointerException e){
			System.out.println("this is null. Their is no length exist");
		}
		
	}
	public void len(){
		String str = null;
		System.out.println("This is the length of str" + str.length());
	}
}

	
		