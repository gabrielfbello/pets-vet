package br.com.unipar.petvet.model;

public class Animal {
    private int id;
    private String nome;

    private String raca;

    private String especie;

    private String sexo;

    private int idade;

    private int idProprietario;

    public Animal() {
    }

    public Animal(int id, String nome, String raca, String especie, String sexo, int idade, int idProprietario) {
        this.id = id;
        this.idProprietario = idProprietario;
        this.nome = nome;
        this.raca = raca;
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

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
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

    public int getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(int idProprietario) {
        this.idProprietario = idProprietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "id: " + id + "\n" +
                "nome: " + nome + "\n" +
                "raca: " + raca + "\n" +
                "especie: " + especie + "\n" +
                "sexo: " + sexo + "\n" +
                "idade: " + idade + "\n" +
                "idProprietario: " + idProprietario + "\n";
    }
}
