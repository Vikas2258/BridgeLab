import java.util.Arrays;
public class Anagram {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char []a = str1.toCharArray();
        char []b = str2.toCharArray();
        Arrays.sort(a);;
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silents";
        System.out.println(isAnagram(str1, str2));
    }
}
