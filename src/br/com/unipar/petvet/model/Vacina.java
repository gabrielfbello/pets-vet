package br.com.unipar.petvet.model;

public class Vacina {
    private int id;
    private String name;
    private String medicationSchedule;

    private String data;

    private String hora;

    public Vacina(int id, String name, String medicationSchedule, String data, String hora) {
        this.id = id;
        this.name = name;
        this.medicationSchedule = medicationSchedule;
        this.data = data;
        this.hora = hora;
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

    public String getMedicationSchedule() {
        return medicationSchedule;
    }

    public void setMedicationSchedule(String medicationSchedule) {
        this.medicationSchedule = medicationSchedule;
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
                "name: " + name + "\n" +
                "medicationSchedule: " + medicationSchedule + "\n";
    }
}