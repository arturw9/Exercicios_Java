package br.com.abc.javacore.Bindroducaometodos.test;

import br.com.abc.javacore.Bindroducaometodos.classes.Estudante;


public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Artur");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{8, 8, 8});
        estudante.imprimi();

        System.out.println("Aprovado? "+estudante.isAprovado());

    }
}