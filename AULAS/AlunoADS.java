package AULAS;

import java.util.Scanner;

public class AlunoADS extends Aluno{

	double trab1, trab2, mediaAds;

	void pegaTrabalhos(){
		Scanner trabs = new Scanner(System.in);

		System.out.println("Diga o valor do primeiro trabalho: ");
		trab1 = trabs.nextDouble(); 

		System.out.println("Diga o valor do segundo trabalho: ");
		trab2 = trabs.nextDouble();

	}

	void calculaMediaAds(){
		mediaAds = (trab1 + trab2 + nota1 + nota2)/4;
	}
	
	public static void main(String[] args) {
		AlunoADS aluno = new AlunoADS();
		 aluno.recebeNotas();
		 aluno.calculaMedia();
		 aluno.pegaTrabalhos();
		 aluno.calculaMediaAds();
		System.out.println("A média do Aluno foi: "+aluno.mediaAds);

	}

}
