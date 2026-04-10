package model;

public class Paciente {
    private int id;
    private String nome;
    private int idade;

    public Paciente(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}

