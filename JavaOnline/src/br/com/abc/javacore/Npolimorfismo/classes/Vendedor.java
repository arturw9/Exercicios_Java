package br.com.abc.javacore.Npolimorfismo.classes;

public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor(String nome, double salario, double TotalVendas) {
        super(nome, salario);
        this.totalVendas = TotalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        totalVendas = totalVendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (totalVendas * 0.05);
    }
}
