package fundamentos;

public class Temperatura {
    //Desafio  feito na aula

    public static void main(String[] args) {
        // (F - 32) * 5/9 = C
        int valorF = 100;
        int valor32 = 32;
        double fator = 5.0/9.0;
        double valorC ;

        valorC = (valorF  - valor32) * fator;
    }
}
