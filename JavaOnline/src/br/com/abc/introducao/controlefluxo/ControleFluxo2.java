package br.com.abc.introducao.controlefluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;
        boolean ok = true;
        status = (ok = false) ? "Não adulto" : "Adulto" ;
        System.out.println(status);
    }
}
