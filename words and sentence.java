import java.util.Scanner;

public class WordAndSentenceCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        int wordCount = countWords(text);
        int sentenceCount = countSentences(text);

        System.out.println("Word count: " + wordCount);
        System.out.println("Sentence count: " + sentenceCount);
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        return words.length;
    }

    public static int countSentences(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        // Assuming that a sentence ends with ".", "!", or "?"
        String[] sentences = text.split("[.!?]");
        return sentences.length;
    }
}
