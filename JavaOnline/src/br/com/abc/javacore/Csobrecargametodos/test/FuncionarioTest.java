package br.com.abc.javacore.Csobrecargametodos.test;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva", "016.209.891-07", 4500, "6277530");
        Funcionario funcionario2 = new Funcionario();
        funcionario.imprime();
        funcionario2.imprime();

    }
}
