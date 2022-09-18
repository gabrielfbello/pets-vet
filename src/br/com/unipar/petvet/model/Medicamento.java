package br.com.unipar.petvet.model;

public class Medicamento {
    private int id;
    private String name;
    private String medicationSchedule;

    public Medicamento(int id, String name, String medicationSchedule) {
        this.id = id;
        this.name = name;
        this.medicationSchedule = medicationSchedule;
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

    @Override
    public String toString() {
        return "br.com.unipar.petvet.model.Medicamento{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", medicationSchedule='" + medicationSchedule + '\'' +
                '}';
    }
}
