import java.util.Arrays;

public class Spyagency {

    
    public static String reverseMessage(String message) {
        return new StringBuilder(message).reverse().toString();
    }

    
    public static boolean isPalindrome(String message) {
        String reversed = reverseMessage(message);
        return message.equalsIgnoreCase(reversed);
    }

    
    public static void countVowelsAndConsonants(String message) {
        int vowels = 0;
        int consonants = 0;

        message = message.toLowerCase();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    
    public static boolean isAnagram(String s1, String s2) {

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    
    public static char firstNonRepeatingCharacter(String log) {

        for (int i = 0; i < log.length(); i++) {
            char ch = log.charAt(i);

            if (log.indexOf(ch) == log.lastIndexOf(ch)) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String secretMessage = "madam";
        String intercept1 = "listen";
        String intercept2 = "silent";
        String surveillanceLog = "swiss";

        
        System.out.println("Original Message: " + secretMessage);
        System.out.println("Reversed Message: "
                + reverseMessage(secretMessage));

        
        System.out.println("Palindrome: "
                + isPalindrome(secretMessage));

        
        countVowelsAndConsonants(secretMessage);

        
        System.out.println("Anagram: "
                + isAnagram(intercept1, intercept2));

        
        char unique = firstNonRepeatingCharacter(surveillanceLog);

        if (unique != '\0') {
            System.out.println("First Non-Repeating Character: "
                    + unique);
        } else {
            System.out.println("No Unique Character Found");
        }
    }
}
