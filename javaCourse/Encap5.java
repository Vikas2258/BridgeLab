//Create a class Book with private fields title, author, and price. 
//Implement getters and setters for each, and create a method displayDetails() that prints all book information.
class Encap5{
	public static void main(String[] args){
		Book b = new Book();
		b.settitle("Ramayan");
		b.setauthor("Hnauman");
		b.setprice(108);
		b.DisplayDetails();
		
	}
}
class Book{
	private String title;
	private String author;
	private int price;
	public String gettitle(){
		return title;
	}
	public String getauthor(){
		return author;
	}
	public int getprice(){
		return price;
	}
	public void settitle(String title){
		this.title = title;
	}
	public void setauthor(String author){
		this.author = author;
	}
	public void setprice(int price){
		this.price = price;
	}
	public void DisplayDetails(){
		System.out.println("this is title " + gettitle());
		System.out.println("this is Author's name " + getauthor());
		System.out.println("this is price " + getprice());
	}
}

	