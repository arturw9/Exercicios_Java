package br.com.abc.javacore.Passertions.test;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-1000);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0) : "O salário não dever ser menor do que zero, o salario veio: " + salario;
        //calculo do salario
    }

    public static void diasDaSemana(int dia) {

    }
}
