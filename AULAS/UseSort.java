package AULAS;
import java.util.Random;

public class UseSort {



    public static void main(String[] args) {
        ShellSort sort = new ShellSort();

        System.out.println("Vetor original:");
        int[] arr = sort.criaVetor(7);
        sort.printArray(arr);
        System.out.println("------------------\n");


//        ShellSort shellSort = new ShellSort();
        sort.shellSort(arr);

        System.out.println("\nVetor ordenado:");
        sort.printArray(arr);
    }

    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
