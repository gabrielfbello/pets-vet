package br.com.unipar.petvet.model;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Proprietario {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private List<Integer> idAnimais;
    private static final AtomicInteger count = new AtomicInteger(0);
    public Proprietario(String nome, String cpf, String endereco, String telefone, List<Integer> idAnimais) {
        this.id = count.incrementAndGet();
        this.idAnimais = idAnimais;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getIdAnimais() {
        return idAnimais;
    }

    public void setIdAnimais(List<Integer> idAnimais) {
        this.idAnimais = idAnimais;
    }

    public void addIdAnimal(int idAnimal) {
        this.idAnimais.add(idAnimal);
    }

    public void removeIdAnimal(int idAnimal) {
        this.idAnimais.remove(idAnimal);
    }
}
