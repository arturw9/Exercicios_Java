package br.com.abc.javacore.Bindroducaometodos.test;

import br.com.abc.javacore.Bindroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
//
        Calculadora.somaDoisNumeros();
        Calculadora.subtraiDoisNumeros();
        Calculadora.multiplicaDoisNumeros(5,5);
        System.out.println("Divisão de dois numeros");
        double result = Calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println("Imprimi 2 numeros divididos");
        Calculadora.imprimiDoisNumerosDivididos(20,0);
        System.out.println("Continuando a execução");

        int[] numeros = {1,2,3,4,5};
        Calculadora.somaArray(numeros);
        Calculadora.somaVarArgs(1,2,3,4,5);
    }
}
