import java.util.Stack;

public class Exercicio5 {

    public static Stack<Character> removeDuplicates(Stack<Character> stack) {
        Stack<Character> aux = new Stack<>();
        Stack<Character> result = new Stack<>();

        while (!stack.isEmpty()) {
            char current = stack.pop();
            if (!aux.contains(current)) {
                aux.push(current);
            }
        }

        while (!aux.isEmpty()) {
            result.push(aux.pop());
        }

        return result;
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('@');
        stack.push('&');
        stack.push('@');
        stack.push('#');
        stack.push('%');
        stack.push('&');
        stack.push('$');

        Stack<Character> result = removeDuplicates(stack);

        System.out.println("Pilha sem duplicatas: " + result);
    }
}