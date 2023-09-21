package AULAS;

import java.util.Scanner;

public class Aluno{

	double nota1, nota2, media;

	void recebeNotas(){
		Scanner ler = new Scanner(System.in);
		System.out.println("Valor da primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Valor da segunda nota: ");
		nota2 = ler.nextDouble();

	}

	void calculaMedia(){
		media = (nota1 + nota2)/2;
		System.out.println("O valor da média foi: "+media);
	}

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.recebeNotas();
		aluno.calculaMedia();
	}
}
