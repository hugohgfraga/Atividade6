import java.util.Stack;

public class Exercicio2 {
    public static boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        String cleanedWord = word.replaceAll("\\s+", "").toLowerCase();

        for (char c : cleanedWord.toCharArray()) {
            stack.push(c);
        }

        for (char c : cleanedWord.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "arara"; 
        if (isPalindrome(word)) {
            System.out.println(word + " é um palíndromo.");
        } else {
            System.out.println(word + " não é um palíndromo.");
        }
    }
}