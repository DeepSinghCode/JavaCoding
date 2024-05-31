public class App {

    public static boolean areAnagrams(String str1, String str2) {

        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Array to store ASCII frequencies of characters
        int[] charFrequency = new int[256];

        // Increment frequencies for characters in str1
        for (char c : str1.toCharArray()) {
            charFrequency[c]++;
        }

        // Decrement frequencies for characters in str2
        for (char c : str2.toCharArray()) {
            charFrequency[c]--;
        }

        // Check if all frequencies are zero
        for (int frequency : charFrequency) {
            if (frequency != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

    }
}