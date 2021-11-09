package br.com.abc.javacore.Bindroducaometodos.test;

import br.com.abc.javacore.Bindroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.cpf = "016.209.891.07";
        professor.matricula = "1912374";
        professor.nome = "Artur";
        professor.rg = "6277530";

        Professor professor2 = new Professor();
        professor2.cpf = "016.888.891.07";
        professor2.matricula = "1945698";
        professor2.nome = "Fidelis";
        professor2.rg = "9484681";

        professor.imprimi();
        professor2.imprimi();

//        professor.imprimi(professor2);

    }
}
