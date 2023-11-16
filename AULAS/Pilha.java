package AULAS;
import java.util.Stack;
public class Pilha {

    static boolean result;
    static int posicao;


    public static void main(String[] args) {
        Stack <Integer> pilha = new Stack();
        pilha.push(1);
        pilha.push(12);
        pilha.push(123);
        pilha.push(1234);
        pilha.push(12345);
        System.out.println("Elemento do topo da pilha " + pilha);
        pilha.pop();
        System.out.println("Elemento do topo da pilha " + pilha.peek());
        result = pilha.empty();
        System.out.println("A pilha está vazia? " + result);
        posicao = pilha.search(12);
        System.out.println("A posição do elemento é: " + posicao);


    }
}
