package AULAS;

public class TesteSenha extends JogoDaSenha {
    public static void main(String[] args) {
        JogoDaSenha jogar = new JogoDaSenha();

        jogar.mensagemAbertura();
        while(!jogar.acertou) {
            try{
                jogar.loop();
            } catch (Exception exception){
                System.out.println("Insira valores válidos");
            }
        }
    }
}
