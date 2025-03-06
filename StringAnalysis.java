import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters
        int vowels = 0, consonants = 0, digits = 0, specialCharacters = 0;

        // Convert the input to lowercase to make vowel checking case-insensitive
        input = input.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check for consonants (alphabetic characters excluding vowels)
            else if (Character.isAlphabetic(ch)) {
                consonants++;
            }
            // Check for digits
            else if (Character.isDigit(ch)) {
                digits++;
            }
            // Check for special characters (anything else)
            else {
                specialCharacters++;
            }
        }

        // Output the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);
    }
}
