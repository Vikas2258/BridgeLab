public class OnlyDigitsCheck {
    public static void main(String[] args) {
        String input = "123456"; // change this to test other strings

        if (containsOnlyDigits(input)) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains other characters too.");
        }
    }

    public static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return !str.isEmpty(); // returns false for empty string
    }
}
