public class TitleCaseExample {
    public static void main(String[] args) {
        String input = "hello world this is java";
        String result = convertToTitleCase(input);
        System.out.println("Title Case: " + result);
    }

   
    public static String convertToTitleCase(String str) {
        String[] words = str.split(" "); 
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String remainingLetters = word.substring(1).toLowerCase();
                result += firstLetter + remainingLetters + " ";
            }
        }

        return result.trim(); // Remove the extra space at the end
    }
}
