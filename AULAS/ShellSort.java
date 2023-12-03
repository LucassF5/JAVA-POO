package AULAS;

import java.util.Random;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original:");
        printArray(arr);

        shellSort(arr);

        System.out.println("\nArray ordenado:");
        printArray(arr);
    }

    int[] criaVetor(int numero) {
        int[] vetor = new int[numero];
        Random random = new Random();
        for (int num = 0; num < vetor.length; num++) {
            vetor[num] = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        }
        return vetor;
    }

    static void shellSort(int arr[]) {
        int n = arr.length;
        int ordena = 0;
        int posicao = 0;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
//                System.out.println("Ordenaçao número " + ordena + " / gap número " + gap);
//                System.out.println("Ordenaçao número " + ordena + " / gap número " + gap);
//                printArray(arr);
//                System.out.println("-----------------------");


                while (j >= gap && arr[j - gap] > temp) {
                    posicao = j;
                    arr[j] = arr[j - gap];
                    j -= gap;
//                    ordena++;
//                    System.out.println("Ordenaçao número " + ordena + " / gap número " + gap);
//                    printArray(arr);
//                    System.out.println("-----------------------");
                }
                System.out.println("Ordenaçao número " + ordena + " / trocado " + j + " / posição " + posicao);
                printArray(arr);
                System.out.println("-----------------------");
                arr[j] = temp;
                ordena++;
            }

        }
    }

    static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
