import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Get sentence input from user
        String sentence = getSentenceInput();

        // Count words in the sentence
        int wordCount = countWords(sentence);

        // Display the result
        System.out.println("The sentence has " + wordCount + " words.");
    }

    // Method to get sentence input from the user
    public static String getSentenceInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        input.close();
        return sentence;
    }

    // Method to count words in a sentence
    public static int countWords(String sentence) {
        if (sentence.trim().isEmpty()) {
            return 0; // Handle empty input case
        }
        String[] words = sentence.trim().split("\\s+"); // Split by spaces
        return words.length;
    }
}
