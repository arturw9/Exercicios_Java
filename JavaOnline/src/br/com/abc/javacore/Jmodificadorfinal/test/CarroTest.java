package br.com.abc.javacore.Jmodificadorfinal.test;

import br.com.abc.javacore.Jmodificadorfinal.classes.Carro;
import br.com.abc.javacore.Jmodificadorfinal.classes.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Kurinrin");
        System.out.println(c.getComprador());
    }
}
