package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        System.out.println(Carro.getVelocidadeLimite());
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Porshe", 270);
        Carro carro3 = new Carro("Mercedes", 260);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

        System.out.println("####################");

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
