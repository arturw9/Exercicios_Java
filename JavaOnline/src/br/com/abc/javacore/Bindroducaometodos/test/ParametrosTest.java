package br.com.abc.javacore.Bindroducaometodos.test;

import br.com.abc.javacore.Bindroducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do teste");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}
