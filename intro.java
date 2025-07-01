import java.util.Scanner;
class MyWorld{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		int result = a+b;
		System.out.println(result);
	}
}
