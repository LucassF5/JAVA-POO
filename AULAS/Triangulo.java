package AULAS;

public class Triangulo {
    int ladoA, ladoB, ladoC;

    Triangulo(){}

    public void setLados(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public void calculaTriangulo(int ladoA, int ladoB, int ladoC){
        if ((ladoA == ladoB) && (ladoB == ladoC) && (ladoA == ladoC)){
            System.out.println("Triângulo Equilátero");
        } else if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)){
            System.out.println("Triângulo Isósceles");
        } else if ((ladoA != ladoB) || (ladoB != ladoC) || (ladoA != ladoC)){
            System.out.println("Triângulo Escaleno");
        }
    }

    public static void main(String[] args) {
        Triangulo p = new Triangulo();
        p.setLados(2,2,3);

        p.calculaTriangulo(p.ladoA, p.ladoB, p.ladoC);
        System.out.println();

        Triangulo triangulo = new Triangulo();
        triangulo.setLados(6,6,6);

        triangulo.calculaTriangulo(triangulo.ladoA, triangulo.ladoB, triangulo.ladoC);


    }
}
