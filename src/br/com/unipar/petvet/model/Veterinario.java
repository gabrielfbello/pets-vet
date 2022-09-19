package br.com.unipar.petvet.model;

public class Veterinario {
    private int id;
    private String nome;
    private String crmv;
    private String telefone;
    private String endereco;
    private String email;
    private String dataCadastro;

    public Veterinario(int id, String nome, String crmv, String endereco, String telefone, String dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.crmv = crmv;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
