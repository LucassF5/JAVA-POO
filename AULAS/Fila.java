package AULAS;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue fila = new LinkedList();
        fila.add(1);
        fila.add(2);
        fila.add(3);
        System.out.println("Fila");
        System.out.println("Fila antes da remoção "+fila);
        fila.remove();
        System.out.println("Fila após da remoção "+fila);
        System.out.println("-------------------------");

    }
}
