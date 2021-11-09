package br.com.abc.javacore.Aintroducaoclasses.teste;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Artur Fidelis";
        professor.matricula = "1912374";
        professor.rg = "6277530";
        professor.cpf = "016.209.891.07";
        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

    }
}
