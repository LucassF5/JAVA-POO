package AULAS;

import java.util.Scanner;

public class Provas {

    double P1, P2;
    double media, mediaFinal;
    double P3, maior;
    //float nota1, nota2;

//    void setNotas(){
//        Scanner ler = new Scanner(System.in);
//        System.out.print("Valor da primeira nota: ");
//        this.P1 = ler.nextDouble();
//        System.out.print("Valor da segunda nota: ");
//        this.P2 = ler.nextDouble();
//        System.out.println("Nota 1: " + this.P1);
//        System.out.println("Nota 2: " + this.P2);
//    }

    public void setNotas() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Valor da primeira nota: ");
        this.P1 = ler.nextDouble();
        System.out.print("Valor da segunda nota: ");
        this.P2 = ler.nextDouble();
    }


    public void setP3() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Valor da terceira nota: ");
        this.P3 = ler.nextDouble();
    }

    void setMedia(){
        this.media = (this.P1 + this.P2)/2;
        System.out.println("O valor da média foi: "+this.media);
    }

    public void setMediaFinal() {
        double max = Math.max(P1, P2);
        System.out.println("O valor da maior nota é: "+max);
        setP3();
        mediaFinal = P3/2+max/2;
        if (mediaFinal >=5 ){
            System.out.println("A média final foi: "+mediaFinal);
            System.out.println("Aprovado");
        } else {
            System.out.println("A média final foi: "+mediaFinal);
            System.out.println("Reprovado");
        }

    }

    double testaMaior(double P1, double P2) {
        if (P1>P2){
            return  maior=this.P1;
        } else{
            return  maior=this.P2;
        }
    }
    void alunoSituacao(){
        if((this.media>=5) && (this.P1>3 && this.P2>3))
            System.out.println("Aprovado!!!!");
        else if (this.media>=3){
            System.out.println("Está de final");
            setMediaFinal();
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        Provas aluno = new Provas();
        aluno.setNotas();
        aluno.setMedia();
        aluno.alunoSituacao();
    }

}
