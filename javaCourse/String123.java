class String123{
	
	public static void main(String[] args){
		String str = "madam";
		int left = 0;
		int right = str.length() - 1;
		while(left < right){
			if(str.charAt(left++) != str.charAt(right--)){
				System.out.println("it is not a palindrome");
				return;
				
			}
		}
		System.out.println("It is a palindrome");
	}
}
		
		