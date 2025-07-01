import java.util.Scanner;

public class checkArray2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []arr = {1,2,3,4,5,6,7,8,9,0};
        int n = sc.nextInt();
        boolean found = false;
        for(int i = 0;i<=arr.length - 1;i++){
            if(arr[i] == n){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println(n + " is present in the array");
        }
        else{
            System.out.println(n + " is not present in the array");
        }
    }
}
