import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rm = 0;
        while(n>0){
            int l = n % 10;
            rm = rm + l;
            n = n/10;
        }
        System.out.println(rm);
    }
}
