package AULAS;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i<n;i++){
            for(int j=1; j<(n-1); j++){
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,53,654,7655,32,65,23,67};

        System.out.println("Vetor");
    }
}
