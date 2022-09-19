package br.com.unipar.petvet.model;

public class Veterinario {
    private int id;
    private String nome;
    private String crmv;
    private String telefone;
    private String endereco;
    private String email;
    private String dataCadastro;
    private String dataUltimaConsulta;

    public Veterinario(int id, String nome, String crmv, String endereco, String telefone, String email, String dataCadastro, String dataUltimaConsulta) {
        this.id = id;
        this.nome = nome;
        this.crmv = crmv;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.dataUltimaConsulta = dataUltimaConsulta;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataUltimaConsulta() {
        return dataUltimaConsulta;
    }

    public void setDataUltimaConsulta(String dataUltimaConsulta) {
        this.dataUltimaConsulta = dataUltimaConsulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
