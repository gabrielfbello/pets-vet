package br.com.unipar.petvet.model;

public class Medicamento {
    private int id;
    private String name;

    public Medicamento(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                "name: " + name;
    }
}
