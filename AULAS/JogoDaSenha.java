package AULAS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JogoDaSenha {

    int[] vetor = new int[30];
    int[] palpites = new int[5];
    int t1, t2, t3, t4, t5, contador;
    int i=0; int j =0; int num=0;
    int contaTentativa=1;
    boolean acertou=false;
    String numsCoincididos;
    ArrayList<Integer> coincididos = new ArrayList<>();
    Random random = new Random();

    void criaVetor(){
        for( num=0; num<vetor.length; num++){
            this.vetor[num] = random.nextInt(1,101);
            testaVetor();
        }
        Arrays.sort(vetor);
        testaVetor();
    }

    void testaVetor(){
        for ( i = 0; i <= vetor.length; i++) {
            for (j = i + 1; j < vetor.length; j++) {
                int repetido = vetor[j];
                if (vetor[i] == repetido) {
                    vetor[i] = random.nextInt(1,101);
                } else {
                    continue;
                }
            }
        }
    }


    void getVetor() {
        for( num=0; num<vetor.length; num++){
            System.out.println("Posição número("+(num+1)+") => "+vetor[num]);
        }
    }

    int fazerTentativa(int t1, int t2, int t3, int t4, int t5){
        palpites[0] = t1;
        palpites[1] = t2;
        palpites[2] = t3;
        palpites[3] = t4;
        palpites[4] = t5;
        System.out.println("Os valores inseridos foram: "+t1+","+t2+","+t3+","+t4+","+t5);
        testaPalpites();
        return contador;
    }

    int fazerTentativa() {
        Scanner ler = new Scanner(System.in);
        for (num = 0; num < palpites.length; num++) {
            System.out.print("Insira o valor " + (num + 1) + ": ");
            palpites[num] = ler.nextInt();
        }
        System.out.println("Os valores inseridos foram: ");
        for (num = 0; num < palpites.length; num++){
            System.out.print(palpites[num]+"\t");
        }
        testaPalpites();
        return contador;
    }

    void testaPalpites(){
        limpaListaCoincididos();
        numsCoincididos="";
        for ( i = 0; i < palpites.length; i++) {
            for (j = 0; j <= vetor.length-1; j++) {
                int repetido = vetor[j];
                if (palpites[i] == repetido) {
                    coincididos.add(repetido);
                    this.contador++;
                } else {
                    continue;
                }
            }
        }
    }


    void loop(int t1, int t2, int t3, int t4, int t5){
        System.out.println("-------------------------------------------------------");
        criaVetor();
        fazerTentativa(t1, t2, t3, t4, t5);
        getSenha();
    }

    void loop(){
        System.out.println("-------------------------------------------------------");
        criaVetor();
        fazerTentativa();
        getSenha();
    }

    void limpaListaCoincididos(){
        for(num=0; num<coincididos.size(); num++){
            coincididos.clear();
        }
    }

    void getContadorPesquisa(){
        System.out.println("Tentativa(s): "+contaTentativa);
    }

    String getSenha(){
        System.out.println("\n");
        numsCoincididos = coincididos.toString();
        getContadorPesquisa();
        System.out.println("\nO valor de coincididos foi: "+contador+"\n");
        if(contador==5){
            contaTentativa=1;
            System.out.println("Coincididos no array: " + numsCoincididos);
            System.out.println("\nTodos números da sequência eram: ");
            getVetor();
            acertou=true;
            return numsCoincididos;

        } else {
            contaTentativa++;
            System.out.println("Você ainda não adivinhou a senha!\n");
            acertou=false;
            contador = 0;
            return numsCoincididos;
        }
    }

    void mensagemAbertura(){
        System.out.println("                           Bem-vindo(a)\n" +
                "Este jogo consiste em tentar acertar 5 números de uma lista com 30\n" +
                "A lista é criada com valores aleatórios de 1 a 100\n" +
                "Quando os 5 estiverem corretos a lista é mostrada\n" +
                "\tObs: Proibido colocar valores inválidos\n" +
                "                           BOM JOGO!!!");
    }

    public static void main(String[] args) {
        JogoDaSenha teste = new JogoDaSenha();

        teste.criaVetor();
        teste.fazerTentativa(98,36,27,78,0);
        teste.getSenha();

        teste.criaVetor();
        teste.fazerTentativa(34,67,86,92,95);
        teste.getSenha();

    }
}
