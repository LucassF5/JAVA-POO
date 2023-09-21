package AULAS;

import java.util.Scanner;

public class Fatura {

    public String numero;
    public String descricao;
    int quantidade;
    protected double preco;

    Fatura(){}

    public void setNumero() {
        System.out.println("Diga o número do produto: ");
        Scanner numeroProduto = new Scanner(System.in);
        this.numero = numeroProduto.nextLine();
    }

    public void setDescricao() {
        System.out.println("Dê a descrição: ");
        Scanner descricao = new Scanner(System.in);
        this.descricao = descricao.nextLine();
    }

    public void setQuantidade() {
        System.out.println("Dê a quantidade do produto: ");
        Scanner quantidadeProduto = new Scanner(System.in);
        this.quantidade = quantidadeProduto.nextInt();
    }

    public void setPreco() {
        System.out.println("Diga o preço do produto: ");
        Scanner precoProduto = new Scanner(System.in);
        this.preco = precoProduto.nextDouble();
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        if(preco<0){
            return 0;
        } else {
            return preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotalFatura(){
        if(preco<0){
            return 0;
        }
        return quantidade * preco;
    }
}
