public class StrMethods {
    public static void main(String[] args) {
        // Initialize the main string
        String mainString = " Hello World! This is a program based on string methods";

        // 1. Length Calculation
        int length = mainString.length();
        System.out.println("Length of the string: " + length);

        // 2. Character Extraction
        char charAt12 = mainString.charAt(12);
        System.out.println("Character at index 12: " + charAt12);

        // 3. Substring Extraction
        String substring = mainString.substring(2, 8);
        System.out.println("Substring of the main string: " + substring);

        // 4. Index Finding
        int firstOccurrence = mainString.indexOf('l');
        int lastOccurrence = mainString.lastIndexOf('l');
        System.out.println("First occurrence of 'l': " + firstOccurrence);
        System.out.println("Last occurrence of 'l': " + lastOccurrence);

        // 5. Case Conversion
        String upperCase = mainString.toUpperCase();
        System.out.println("String to uppercase: " + upperCase);
        String lowerCase = mainString.toLowerCase();
        System.out.println("String to lowercase: " + lowerCase);

        // 6. Trimming
        String trimmedString = mainString.trim();
        System.out.println("Trimming the string for white spaces: " + trimmedString);

        // 7. Replacement
        String replacedChars = mainString.replace('l', '1');
        System.out.println("Replacing 'l' with '1': " + replacedChars);
        String replacedWord = mainString.replace("World", "Sowndharya");
        System.out.println("Replacing 'World' with 'Sowndharya': " + replacedWord);

        // 8. Equality Check
        boolean equalsCheck = mainString.equals(" Hello World! ");
        System.out.println("Equality check with ' Hello World! ': " + equalsCheck);

        // 9. Contains Check
        boolean containsCheck = mainString.contains("lo");
        System.out.println("Substring 'lo' is contained in the main string: " + containsCheck);

        // 10. Starts and Ends With
        boolean startsWithCheck = mainString.startsWith("Hel");
        System.out.println("Starts with 'Hel': " + startsWithCheck);
        boolean endsWithCheck = mainString.endsWith("ld! ");
        System.out.println("Ends with 'ld! ': " + endsWithCheck);

        // 11. Splitting
        String[] words = mainString.split(" ");
        System.out.println("Words split based on spaces:");
        for (String word : words) {
            System.out.println(word);
        }

        // 12. Convert to Char Array
        char[] charArray = mainString.toCharArray();
        System.out.println("Each character in the string:");
        for (char ch : charArray) {
            System.out.println(ch);
        }
    }
}
