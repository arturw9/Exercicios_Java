package br.com.abc.javacore.Sstrings.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String "+ (fim-inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(200000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder "+ (fim-inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(200000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer "+ (fim-inicio) + " ms");
    }

    private static void concatString(int tam) {
       String string = "";
       for (int i=0; i<tam; i++) {
           string += i;
       }
    }

    private static void concatStringBuilder(int tam) {
        StringBuilder ab = new StringBuilder(tam);
        for (int i=0; i<tam; i++) {
            ab.append(i);
        }
    }

    private static void concatStringBuffer(int tam) {
        StringBuffer ab = new StringBuffer(tam);
        for (int i=0; i<tam; i++) {
            ab.append(i);
        }
    }
}
