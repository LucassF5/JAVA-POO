package AULAS;

public class Recursividade {
    int num, res;


    float recursividade(float num){
        if (num==1){
            return 1;
        } else {
            return 1/num + recursividade(num-1);
        }
        //return num;

    }
    int recursividade(int num){
        if (num==0){
            return 0;
        } else if (num==1){
            return 1;
        } else {
            return 2*(recursividade(num-1)) + recursividade(num-2);
        }
        //return num;

    }

    public static void main(String[] args) {
        Recursividade r = new Recursividade();
        System.out.println(r.recursividade(8));
    }
}
