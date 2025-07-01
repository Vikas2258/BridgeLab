class polymorphism7{
	public static void main(String[] args){
		rollno a = new rollno();
		a.details();
	}
}
class student{
	void details(){
		System.out.println("My name is vikas");
	}
}
class address extends student{
	void details(){
		System.out.println("manimajra");
	}
}
class rollno extends address{
	void details(){
		System.out.println("2210990959");
	}
}
