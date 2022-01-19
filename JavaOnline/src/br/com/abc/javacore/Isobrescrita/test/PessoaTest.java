package br.com.abc.javacore.Isobrescrita.test;

import br.com.abc.javacore.Isobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina na esquina");
        p.setIdade(300);
        System.out.println(p);
        Pessoa p2 = new Pessoa();
        p2.setNome("Joaquina na outra esquina");
        p2.setIdade(3010);
        System.out.println(p2);
    }
}
