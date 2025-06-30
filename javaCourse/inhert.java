class inhert{
	public static void main(String[] args){
		lion l = new lion();
		l.hunt();
		l.flying();
		l.dog();
	}
	
}
class animal{
	void dog (){
		System.out.println("Bark");
	}
}
class bird extends animal{
	void flying(){
		System.out.println("flying");
	}
}
class lion extends bird{
	void hunt(){
		System.out.println("hunting");
	}
}


