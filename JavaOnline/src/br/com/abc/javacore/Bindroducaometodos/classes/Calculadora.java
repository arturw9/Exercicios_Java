package br.com.abc.javacore.Bindroducaometodos.classes;

public class Calculadora {

    public static void somaDoisNumeros(){
        System.out.println(5+5);
    }
    public static void subtraiDoisNumeros(){
        System.out.println(5-5);
    }
    public static void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
    public static double divideDoisNumeros(double num1, double num2){
        if (num2 != 0){
            return num1 / num2;
        }
        return 0;
    }
    public static void imprimiDoisNumerosDivididos(double num1, double num2) {

        if (num2 != 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Não é possivel dividir por 0");
        }
    }
    public static void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1"+num1);
        System.out.println("num2"+num2);
    }

    public static void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public static void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
