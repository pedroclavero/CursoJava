package controle;

import javax.swing.*;

public class IF_ELSE {
    public static void main(String[] args) {
            String valor = JOptionPane.showInputDialog("Informe o valor");
            int numero  = Integer.parseInt(valor);

            if(numero % 2 == 0){
                System.out.println("Valor Par");
            }
            if(numero % 2 == 1) {
                System.out.println("Valor Ímpar!!"  );
            }

            if(numero % 2 == 0){
                System.out.println("Valor Par");
            }
            else {
                System.out.println("Valor Ímpar");
            }

    }
}
