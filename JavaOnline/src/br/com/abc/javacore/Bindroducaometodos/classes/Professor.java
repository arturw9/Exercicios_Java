package br.com.abc.javacore.Bindroducaometodos.classes;

/*Crie os seguintes atributos para essa clase
* Nome
* Matricula
* rg
* cpf
* Crie uma classe de teste para preencher e imprimir os dados desse professor
* */
public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprimi(){
        System.out.println("----------------------");
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.rg);
    }
}
