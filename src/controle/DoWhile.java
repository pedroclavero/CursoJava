package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        String texto = "";

        do {
            System.out.println("Voce quer sair ?");
            texto = valor.next();

        } while (!texto.equals("Sair!!"));
    }
}
