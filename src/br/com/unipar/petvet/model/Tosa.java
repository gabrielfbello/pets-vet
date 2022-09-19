package br.com.unipar.petvet.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Tosa {
    private int id;
    private String name;
    private String medicationSchedule;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Tosa(String name, String medicationSchedule) {
        this.id = count.incrementAndGet();
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
        return
                "id: " + id + "\n" +
                "name: " + name + "\n" +
                "medicationSchedule: " + medicationSchedule + "\n";
    }
}
