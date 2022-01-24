package br.com.abc.javacore.Sstrings.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Artur";
        nome = nome.concat( "Fidelis"); // nome += " Fidelis";
        String nome2 = "Artur";
        String nome3 = new String("Anapolis"); //1 variavel de referencia, 2 um objeto do tipo string
                                                      //3 uma String no pool de String
        String teste = "Goku";
        String teste2 = "goku";
        System.out.println(teste.charAt(3));
        System.out.println(teste.equals(teste2));
        System.out.println(teste.length());
        System.out.println(teste2.replace('a','o'));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.substring(0,5));
        System.out.println(teste2.trim());
    }
}
