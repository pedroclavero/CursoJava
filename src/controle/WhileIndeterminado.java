package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        String valor = "";
        Scanner  entrada = new Scanner(System.in);

        while(!valor.equals("sair")){
            System.out.println("Voce falou: ");
            valor = entrada.next();
        }
        entrada.close();
    }
}
