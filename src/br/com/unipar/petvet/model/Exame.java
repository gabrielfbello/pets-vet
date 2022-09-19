package br.com.unipar.petvet.model;

public class Exame {
    private int id;
    private String name;

    public Exame(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                "name: " + name + "\n";
    }
}
