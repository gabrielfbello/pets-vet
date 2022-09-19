package br.com.unipar.petvet.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Medicamento {
    private int id;
    private String name;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Medicamento(String name) {
        this.id = count.incrementAndGet();
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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                "name: " + name;
    }
}
