package AULAS;

public class Data2 {
    private int dia, mes, ano;

    Data2(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    /*
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    */


    public void displayData(){
        System.out.println("A data é: " + dia + "/" + mes + "/" + ano);
    }

    public static void main(String[] args) {
        Data2 d = new Data2(1, 1, 2023);
        d.displayData();
        d.setDia(25);
        d.setMes(12);
        d.displayData();
    }
}
