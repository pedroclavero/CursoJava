package fundamentos;


public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(1));

        String s = "Boa tarde";
        s = s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
    }
}
