package br.com.abc.javacore.Lclassesabstratas.test;

import br.com.abc.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Anna", "11102-2", 2000);
        Vendedor vendedor = new Vendedor("Camila", "22211-4", 1500, 5000);
        vendedor.calculaSalario();
        gerente.calculaSalario();
        System.out.println(gerente);
        System.out.println("--------------------------------");
        System.out.println(vendedor);
    }
}
