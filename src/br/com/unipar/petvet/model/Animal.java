package br.com.unipar.petvet.model;

import br.com.unipar.petvet.consts.RacaEnum;

public class Animal {
    private String nome;

    private RacaEnum raca;

    private String tipoAnimal;

    private String especie;

    private String sexo;

    private int idade;

    public Animal() {
    }

    public Animal(String nome, RacaEnum raca, String tipoAnimal, String especie, String sexo, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.tipoAnimal = tipoAnimal;
        this.especie = especie;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RacaEnum getRaca() {
        return raca;
    }

    public void setRaca(RacaEnum raca) {
        this.raca = raca;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", raca=" + raca +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                ", especie='" + especie + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
