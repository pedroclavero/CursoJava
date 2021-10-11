package fundamentos;

public class ConvTipoPrimitivosNumerico {
    public static void main(String[] args) {
        double d = 1; // conversao implicita
        float f = (float) 1.132456; // conversao explicita  (CAST)

        int i = 4;
        byte b = (byte) i;

        //Conversao numero -> String
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());

        //Conversao String -> numero


    }
}
