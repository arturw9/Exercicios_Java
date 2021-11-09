package br.com.abc.introducao.controlefluxo;

public class ControleFluxo1 {
    public static void main(String[] args) {
        int idade = 15;
        String categoria;
        float salario = 2000;
        boolean c = false;
        if (idade < 15) {
            categoria = "infantil";
        } else{
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
