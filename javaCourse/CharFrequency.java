public class CharFrequency {
    public static void main(String[] args) {
        String input = "programming"; // example string
        countCharacters(input);
    }

    public static void countCharacters(String str) {
        int[] count = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Display frequency of each character
        boolean[] printed = new boolean[256]; // To avoid printing duplicates
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!printed[ch]) {
                System.out.println(ch + " = " + count[ch]);
                printed[ch] = true;
            }
        }
    }
}
