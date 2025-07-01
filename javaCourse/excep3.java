import java.util.Scanner;

class excep3{
    public static void main(String[] args){
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try{
        int number = Integer.parseInt(str);
        System.out.println("these are numbers " + number);
        }catch(Exception e){
            System.out.println("enter the valid numbers");
        }
    }
}