package br.com.unipar.petvet.model;

import java.util.concurrent.atomic.AtomicInteger;

public class BanhoTosa extends Animal {
    private int id;
    private String data;
    private String hora;
    private static final AtomicInteger count = new AtomicInteger(0);

    public BanhoTosa(int id, String data, String hora) {
        this.id = count.incrementAndGet();
        this.data = data;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                "data: " + data + "\n" +
                "hora: " + hora + "\n";
    }
}
