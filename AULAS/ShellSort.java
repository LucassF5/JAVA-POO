//Aluno: Lucas Franco Rocha
//Turma: B
//Curso: ADS

import java.util.Random;
import java.util.Stack;
import java.util.LinkedList;

public class ShellSort {


    int[] criaVetor(int tamanho) {
        int[] array = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); // Gera números aleatórios entre 0 e 99
        }

        return array;
    }

    public Stack<Integer> criaPilha(int tamanho) {
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            pilha.push(random.nextInt(100)); // Gera números aleatórios entre 0 e 99
        }

        return pilha;
    }

    public LinkedList<Integer> criaLista(int tamanho) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            linkedList.add(random.nextInt(100)); // Gera números aleatórios entre 0 e 99
        }

        return linkedList;
    }


    static void shellSort(int arr[]) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
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
