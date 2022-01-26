package br.com.abc.javacore.Sstrings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("0123456789");
        System.out.println(sb.insert(2, "###"));
    }
}
