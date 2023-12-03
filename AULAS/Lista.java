package AULAS;
import java.util.LinkedList;

public class Lista {

    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        System.out.println("Lista");
        lista.add(1);
        lista.add(3);
        lista.add(4);
        lista.add(1,20);
        lista.add(3,10);
        //Adiciona no index 1 o elemento 2
        System.out.println(lista);
        System.out.println("------------------");
        System.out.println("Lista ordenada");
        lista.sort(null);
        System.out.println(lista);


    }
}
