import java.util.Scanner;

public class largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no.");
        int num1 = sc.nextInt();
        System.out.println("Enter your second no.");
        int num2 = sc.nextInt();
        System.out.println("Enter your third no.");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 >num3){
            System.out.println("First no. is greatest");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("Second no. is greatest");
        }
        else{
            System.out.println("Third no. is greatest");
        }
    }
}
