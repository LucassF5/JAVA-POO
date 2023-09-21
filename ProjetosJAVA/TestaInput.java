package ProjetosJAVA;
import java.util.Scanner;

public class TestaInput{
    public static void main(String [] args){

        // System.out.println("Digite um numero: ");
        // int numero = Integer.parseInt(System.console().readLine());
        // System.out.println("O numero digitado foi: " + numero);

        // System.out.print("Digite um número: ");
        // Scanner num = new Scanner(System.in);
        // int numero = num.nextInt();  
        // System.out.println("Você digitou o número: " + numero);

        int num; //nextInt
        // Usa-se hasNextInt para pegar um valor booleano true caso seja um inteiro
        String frase; //nextLine
        // Usa-se hasNextLine para pegar um valor booleano true caso seja uma String
        double numReal; //nextDouble
        // Usa-se hasNextDouble para pegar um valor booleano true caso seja um double
        String nome; //next
        // Usa-se hasNext para pegar um valor booleano true caso seja um char

        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            nome = ler.nextLine();
            System.out.println("Digite sua idade: ");
            num = ler.nextInt();
            System.out.println("Digite quanto vc tem no banco: ");
            numReal = ler.nextDouble();
            System.out.println("Digite o dia da semana e o mês: ");
            frase = ler.next();
        }
        System.out.println("Os dados digitados foram: ");
        System.out.println("Nome => " + nome);
        System.out.println("Idade => " + num);
        System.out.println("Saldo => " + numReal);
        System.out.println("Dia da semana e mês => " + frase);

    }

}