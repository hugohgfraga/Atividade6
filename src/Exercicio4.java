import java.util.Stack;

public class Exercicio4 {

    public static void removeMinMax(Stack<Integer> stack) {
        Stack<Integer> aux = new Stack<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (!stack.isEmpty()) {
            int value = stack.pop();
            if (value < min) min = value;
            if (value > max) max = value;
            aux.push(value);
        }

        while (!aux.isEmpty()) {
            int value = aux.pop();
            if (value != min && value != max) {
                stack.push(value);
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.push(40);

        removeMinMax(stack);

        System.out.println("Pilha após remover maior e menor: " + stack);
    }
}