import java.util.Random;
import java.util.Scanner;

public class Randompasswordgenerator {

    public static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeDigits, boolean includeSpecialChars) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=<>?{}[]~";
        
        String characterPool = "";
        if (includeUppercase) {
            characterPool += upperCaseLetters;
        }
        if (includeLowercase) {
            characterPool += lowerCaseLetters;
        }
        if (includeDigits) {
            characterPool += digits;
        }
        if (includeSpecialChars) {
            characterPool += specialCharacters;
        }

        if (characterPool.isEmpty()) {
            throw new IllegalArgumentException("No character types selected for the password.");
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Random Password Generator");
        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        System.out.println("Include the following character types:");
        System.out.print("Uppercase letters (true/false): ");
        boolean includeUppercase = scanner.nextBoolean();
        System.out.print("Lowercase letters (true/false): ");
        boolean includeLowercase = scanner.nextBoolean();
        System.out.print("Digits (true/false): ");
        boolean includeDigits = scanner.nextBoolean();
        System.out.print("Special characters (true/false): ");
        boolean includeSpecialChars = scanner.nextBoolean();

        try {
            String password = generatePassword(length, includeUppercase, includeLowercase, includeDigits, includeSpecialChars);
            System.out.println("Generated Password: " + password);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}