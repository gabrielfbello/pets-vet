package br.com.unipar.petvet.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Medicamento {
    private int id;
    private String name;
    private double valor;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Medicamento(String name, double valor) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return name;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                "name: " + name;
    }
}
