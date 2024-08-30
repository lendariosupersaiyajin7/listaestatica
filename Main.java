import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack<>();
        ListaEstatica le = new ListaEstatica(5);

        le.add(1);
        le.isFull();
        le.add(2);
        le.isFull();
        le.add(3);
        le.isFull();
        le.add(4);
        le.isFull();
        le.remove(3);
        le.add(5);
        le.isEmpty();
        le.print();

    }
}
