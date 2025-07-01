import java.util.Scanner;

public class divisible{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%3 == 0){
            System.out.println("No. is divisible by 3");
        }
        else if(n%5 == 0){
            System.out.println("No. is devisible by 5");
        }
        else{
            System.out.println("No. is not devisible by 3 & 5");
        }
    }
}
