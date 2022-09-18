package br.com.unipar.petvet.model;

public class Banho extends BanhoTosa {
    private int id;
    private String data;
    private String hora;

    public Banho(int id, String data, String hora, int id1, String data1, String hora1) {
        super(id, data, hora);
        this.id = id1;
        this.data = data1;
        this.hora = hora1;
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
        return "br.com.unipar.petvet.model.Banho{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}