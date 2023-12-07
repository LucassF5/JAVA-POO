//Aluno: Lucas Franco Rocha
//Turma: B
//Curso: ADS

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class UseSort {

    static void ordenaPilha(Stack<Integer> stack, ShellSort shellSort) {
        int[] array = stack.stream().mapToInt(Integer::intValue).toArray();
        shellSort.shellSort(array);
        stack.clear();
        for (int value : array) {
            stack.push(value);
        }
    }

    static void ordenaLista(LinkedList<Integer> linkedList, ShellSort shellSort) {
        int[] array = linkedList.stream().mapToInt(Integer::intValue).toArray();
        shellSort.shellSort(array);
        for (int i = 0; i < array.length; i++) {
            linkedList.set(i, array[i]);
        }
    }

    public static void main(String[] args) {
        ShellSort shell = new ShellSort();
        //////////////      Arrays     ////////////////////////
        System.out.println("//////////////      Arrays     ////////////////////////");
        int [] array4 = shell.criaVetor(4); //Criando vetor de 4 posições
        System.out.println("Criando vetor de 4 posições:");
        printArray(array4);
        System.out.println("Ordenando vetor de 4 posições:");
        shell.shellSort(array4);
        printArray(array4);

        int [] array6 = shell.criaVetor(6); //Criando vetor de 6 posições
        System.out.println("\nCriando vetor de 6 posições:");
        printArray(array6);
        System.out.println("Ordenando vetor de 6 posições:");
        shell.shellSort(array6);
        printArray(array6);

        int [] array10 = shell.criaVetor(10); //Criando vetor de 10 posições
        System.out.println("\nCriando vetor de 10 posições:");
        printArray(array10);
        System.out.println("Ordenando vetor de 10 posições:");
        shell.shellSort(array10);
        printArray(array10);

        int [] array12 = shell.criaVetor(12); //Criando vetor de 12 posições
        System.out.println("\nCriando vetor de 12 posições:");
        printArray(array12);
        System.out.println("Ordenando vetor de 12 posições:");
        shell.shellSort(array12);
        printArray(array12);

        //////////////      Stack     ////////////////////////
        System.out.println("\n\n//////////////      Stack     ////////////////////////");
        Stack<Integer> pilha = shell.criaPilha(4); //Criando pilha de números aleatórios
        System.out.println("\nA pilha está vazia? " + pilha.empty());
        System.out.println("Elementos na pilha: " + pilha);
        System.out.println("Ordenando pilha");
        ordenaPilha(pilha, shell);
        System.out.println("Pilha ordenada: " + pilha);
        System.out.println("Adicionando elementos na pilha");
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.push(45);
        pilha.push(12);
        pilha.push(76);
        pilha.push(0);
        pilha.push(37);
        System.out.println("Elementos na pilha: " + pilha);
        System.out.println("Reordenando pilha");
        ordenaPilha(pilha, shell);
        System.out.println("Pilha reordenada: " + pilha);

        //////////////      LinkedList     ////////////////////////
        System.out.println("\n\n//////////////      LinkedList     ////////////////////////");
        LinkedList<Integer> lista = shell.criaLista(5);//Criando lista de números aleatórios
        System.out.println("Elementos da lista: " + lista);
        System.out.println("Ordenando lista");
        ordenaLista(lista,shell);
        System.out.println("Adicionando elementos na lista");
        lista.add(98);
        lista.add(2);
        lista.add(-7);
        System.out.println("Elementos na lista: " + lista);
        System.out.println("Reordenando lista");
        ordenaLista(lista, shell);
        System.out.println("Pilha reordenada: " + lista);
    }

    static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
