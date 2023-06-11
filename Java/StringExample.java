public class StringExample {
    public static void main(String[] args) {
        // String declaration and initialization
        String message = "Hello, World!";


        // String gth
        int length = message.length();
        System.out.println("Length of the string: " + length); // Output: 13

        // String concatenation
        String name = "Alice";
        String greeting = "Hello, " + " iam " + name + "!" +"iam "+ "18 Years " +"old ";
        System.out.println(greeting); // Output: Hello, Alice!

        // String comparison
        String str1 = "apple/";
        String str2 = "banana";
        int result = str1.compareTo(str2);
        System.out.println("Comparison result: " + result); // Output: -1 (str1 is lexicographically smaller than str2)

        // String manipulation
        String text = "  Java Programming  ";
        String trimmedText = text.trim();
        System.out.println("Trimmed text: " + trimmedText); // Output: Java Programming

        // String extraction
        String substring = message.substring(7, 12);
        System.out.println("Substring: " + substring); // Output: World

        // String case conversion
        String lowercase = message.toLowerCase();
        String uppercase = message.toUpperCase();
        System.out.println("Lowercase: " + lowercase); // Output: hello, world!
        System.out.println("Uppercase: " + uppercase); // Output: HELLO, WORLD!

        // String splitting
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}