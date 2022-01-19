package br.com.abc.javacore.Kenum.classes;

public enum TipoCliente {
    // constant specific class body
    // corpo de classe especigico constante
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){
        public String getId(){
            return "B";
        }
    };

    private int tipoCliente;
    private String nome;
    TipoCliente(int tipo, String nome) {
        this.tipoCliente = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }
    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipoCliente;
    }
}
