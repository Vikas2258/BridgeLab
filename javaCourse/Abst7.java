class Abst7{
	//Define an abstract class Bank with method getRateOfInterest(). 
	//Extend it to SBI, ICICI, and HDFC with their respective interest rates.

	public static void main(String[] args){
		SBI s = new SBI();
		ICICI i = new ICICI();
		HDFC h = new HDFC();
		s.getRateOfInterest();
		i.getRateOfInterest();
		h.getRateOfInterest();
	}
}
interface Bank{
	abstract void getRateOfInterest();
}
class SBI implements Bank{
	public void getRateOfInterest(){
		System.out.println("1000");
	}
	
}
class ICICI implements Bank{
	public void getRateOfInterest(){
		System.out.println("2000");
	}
}
class HDFC implements Bank{
	public void getRateOfInterest(){
		System.out.println("3000");
		
	}
}