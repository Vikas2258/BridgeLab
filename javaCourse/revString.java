public class revString {
    public static String reverse(String str){
        String srt = "";
        for(int i=str.length() - 1;i>=0;i--){
            srt += str.charAt(i);
        }
        return srt;

    }
    public static void main(String[] args){
        String str = "Vikas";
        System.out.println(reverse(str));
    }
}
