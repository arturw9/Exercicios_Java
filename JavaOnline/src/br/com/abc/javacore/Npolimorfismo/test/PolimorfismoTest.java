package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.Funcionario;
import br.com.abc.javacore.Npolimorfismo.classes.Gerente;
import br.com.abc.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo", 5000, 2000);
        Vendedor v = new Vendedor("Yuri", 2000, 20000);
        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
//        relatorioPagamento.relatorioPagamentoGerente(g);
//        System.out.println("-----------------------");
//        relatorioPagamento.relatorioPagamentoVendedor(v);
        relatorioPagamento.relatorioPagamentoGenerico(g);
        System.out.println("-----------------------");
        relatorioPagamento.relatorioPagamentoGenerico(v);

        Funcionario f = g;
        System.out.println("##############");
        System.out.println(f.getSalario());
    }
}
