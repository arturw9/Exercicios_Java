package br.com.abc.javacore.Dsobrecargaconstrutores.test;

import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("122212", "Fidelis", new double[]{5,7,9}, "06/04/1999");
        estudante.imprime();
    }
}
