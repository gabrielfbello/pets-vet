package br.com.unipar.petvet.model;

public class Proprietario {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String email;
    private String dataCadastro;
    private String dataUltimaConsulta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
}
