class Abst8{
	//Create an abstract class Payment with an abstract method pay(). 
	//Extend it to classes like CreditCard and UPIPayment.
	public static void main(String[] args){
		CreditCard c = new CreditCard();
		UPIPayment u = new UPIPayment();
		c.pay();
		u.pay();
	}
}
abstract class Payment{
	abstract void pay();
}
class CreditCard extends Payment{
	void pay(){
		System.out.println("this is credit card");
	}
}
class UPIPayment extends Payment{
	void pay(){
		System.out.println("This is upi payment");
	}
}
