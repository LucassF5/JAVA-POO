package AULAS;

public class FaturaTeste extends Fatura{
    public static void main(String[] args) {
        Fatura f = new Fatura();
        f.setDescricao();   f.setNumero();
        f.setPreco();       f.setQuantidade();

        System.out.println("Descrição do produto: " + f.getDescricao());
        System.out.println("Número do produto: " + f.getNumero());
        System.out.println("Preço do produto: " + f.getPreco());
        System.out.println("Quantidade do produto: " + f.getQuantidade());
        System.out.println("Fatura total: " + f.getTotalFatura()+" reais\n");

        Fatura fa = new Fatura();
        fa.setDescricao();  fa.setNumero();
        fa.setPreco();      fa.setQuantidade();
        System.out.println("Descrição do produto: " + fa.getDescricao());
        System.out.println("Número do produto: " + fa.getNumero());
        System.out.println("Preço do produto: " + fa.getPreco());
        System.out.println("Quantidade do produto: " + fa.getQuantidade());
        System.out.println("Fatura total: " + fa.getTotalFatura()+" reais");

    }
}
