public class nonRepeatedChar {
    public static char Repeated(String str){
        int [] count = new int[256];
        for(int i = 0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i = 0;i<str.length();i++){
            if(count[str.charAt(i)] == 1){
                return str.charAt(i);
            }
        }
        return ' ';

    }
    public static void main(String[] args){
        String str = "Gaurisha";
        System.out.println("the first non repeated character is " + Repeated(str));
    }
}
