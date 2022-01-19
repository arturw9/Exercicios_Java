package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente) {
//        System.out.println("Gerando relatorio de pagamento para a gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: "+gerente.getNome());
//        System.out.println("Sal�rio desse m�s: "+gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor) {
//        System.out.println("Gerando relatorio de pagamento para os vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: "+vendedor.getNome());
//        System.out.println("Sal�rio desse m�s: "+vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatorio de pagamento para os vendedores");
        funcionario.calcularPagamento();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Sal�rio desse m�s: "+funcionario.getSalario());
    }
}
