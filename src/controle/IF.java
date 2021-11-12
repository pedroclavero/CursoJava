package controle;

public class IF {
    public static void main(String[] args) {
        int media = 10;

        if (media <= 10 && media <= 7){
            System.out.println("Aprovado!!");
        }
        if (media < 7 && media >= 5){
            System.out.println("Recuperação");
        }
        if(media < 5 && media >= 0){
            System.out.println("Reprovado!!");
        }
    }
}
