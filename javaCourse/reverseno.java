import java.util.Scanner;

public class reverseno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to reverse");
        int n = sc.nextInt();
        int rm = 0;
        while(n>0){
            int l = n%10;
            rm =  rm*10 + l;
            n /=10;
        }
        System.out.println(rm);
    }
}
