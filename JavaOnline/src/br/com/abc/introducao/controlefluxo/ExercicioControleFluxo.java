package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
        * Crie uma variavel salario e imprima seus imposto
        * imposto:
        * salario < 1000 5%
        * salario >= 1000 && salario < 2000 10%
        * salario >= 2000 && salario < 4000 15%
        * salario > 5000 20%
        * */
        double salario = 5001;
        double imposto = 0;
        if(salario < 1000){
            imposto = salario * 0.05;
        } else if(salario >= 1000 && salario < 2000){
            imposto = salario * 0.10;
        } else if(salario >= 2000 && salario < 4000){
            imposto = salario * 0.15;
        } else{
            imposto = salario * 0.20;
        }
        System.out.println("O imposto do salario "+salario+" é "+imposto);
    }
}
