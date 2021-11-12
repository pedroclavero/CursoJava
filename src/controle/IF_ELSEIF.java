package controle;

public class IF_ELSEIF {
    public static void main(String[] args) {
        int nota = 0;

        if(nota > 10 || nota < 0){
            System.out.println("Nota invalida");
        } else if( nota >= 8.1){
            System.out.println("Nota A");
        } else if (nota >= 6.1){
            System.out.println("Nota B");
        }
        else if (nota >= 4.1){
            System.out.println("Nota C");
        }
        else if (nota >= 2.1){
            System.out.println("Nota D");
        } else {
            System.out.println("Nota E");
        }
        System.out.println("Fim");

    }
}
