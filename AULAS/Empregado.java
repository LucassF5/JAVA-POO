package AULAS;

import java.util.Scanner;

public class Empregado {
    String nome, sobrenome;
     double salario;

    //Empregado(){}
    void setNome(){
        System.out.println("Digite o nome: ");
        Scanner myName = new Scanner(System.in);
        this.nome = myName.nextLine();
    }

    void setSobrenome(){
        System.out.println("Digite o sobrenome: ");
        Scanner myLastname = new Scanner(System.in);
        this.sobrenome = myLastname.nextLine();
    }

    void setSalario(){
        System.out.println("Digite o salário: ");
        Scanner myMoney = new Scanner(System.in);
        this.salario = myMoney.nextDouble();
    }

    void setAumento(double num_aumento){
        this.salario = this.salario+(num_aumento/100)*(this.salario);
    }

    void getNome(){
        System.out.println("O nome é: "+this.nome);
    }

    void getSobrenome(){
        System.out.println("O sobrenome é: "+this.sobrenome);
    }

    void getSalario(){
        System.out.println("O salário é: "+this.salario);
    }

    void getAumento(){
        System.out.println("O salário com aumento é: "+this.salario);
    }

    public static void main(String[] args) {
        Empregado a = new Empregado();
        a.setNome();              a.getNome();
        a.setSobrenome();         a.getSobrenome();
        a.setSalario();           a.getSalario();
        a.setAumento(10);         a.getAumento();

        Empregado b = new Empregado();
        b.setNome();              b.getNome();
        b.setSobrenome();         b.getSobrenome();
        b.setSalario();           b.getSalario();
        b.setAumento(100);        b.getAumento();
    }
}
