import java.util.Scanner;

public class checkStringArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String []arr = {"Vikas","Neeraj","java","Vansh"};
        System.out.println("Enter the string");
        String n = sc.next();
        boolean found = false;
        for(int i = 0;i<=arr.length - 1;i++){
            if(arr[i].equals(n)){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(n + " is present in the string");
        }
        else{
            System.out.println(n + " is not present in the string");
        }
    }
}
