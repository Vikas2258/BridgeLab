public class palindrome {
    public static void main(String[] args) {
        int n = 1231;
        int new1 = n;
        int l;
        int rm = 0;
        while(n > 0) {
            l = n % 10;
            rm = rm * 10 + l;
            n = n / 10;
        }
        if(rm == new1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}