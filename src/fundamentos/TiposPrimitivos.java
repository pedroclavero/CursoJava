package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionario
        //Tipos numéricos inteiro

        byte anosDeEmpresa = 23; //Vai ate -128 a +127
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3134845223L;

        // Tipos numericos reais
        float salario = 11445.44F;
        double vendasAcumuladas = 2991797103.01;

        //Tipo booleano
        boolean estaDeFerias = false; //True
        //Tipo caractere
        char status = 'A';// Ativo

        //Dias de empresa
         System.out.println(anosDeEmpresa * 365);
         //Numeros de viagens
        System.out.println(numerosDeVoos / 2);
        //Pontos real
        System.out.println(pontosAcumulados / vendasAcumuladas );

        System.out.println(id + ": ganha -> "   + salario);
        System.out.println("Ferias: " + estaDeFerias);
        System.out.println("Status " + status);
    }
}
