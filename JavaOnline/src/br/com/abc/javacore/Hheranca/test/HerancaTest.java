package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gina");
        Endereco endereco = new Endereco();
        pessoa.setNome("Gina");   pessoa.setCpf("12345");
        endereco.setBairro("Bairro 1");
        endereco.setRua("Rua 25");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("---------------------");
        Funcionario funcionario = new Funcionario("Joao");
        funcionario.setNome("Artur");
        funcionario.setCpf("44848");
        funcionario.setSalario(15000);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
        funcionario.notifyAll();
    }
}
