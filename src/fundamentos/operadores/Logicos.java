package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean c1  = true;
        boolean c2  = 3 > 7;

        System.out.println( c1 && c2);
        System.out.println( c1 || c2);
        System.out.println(c1 ^ c2);
        System.out.println(!c1);
        System.out.println(!c2);
        System.out.println(!!c1);

        /* Tabela verdade And &&
            true && true = true
            true && false = false
            false && true = false
            false && false = false

           Tabela verdade OR ||
            true || true = true
            true || false = true
            false || true = true
            false || false = false

           Tabela verdade XOR ^
             true ^ true = false
            true ^ false = true
            false ^ true = true
            false ^ false = false

           Tabela do Not
           !true = false
           !false = true
        */
    }
}
