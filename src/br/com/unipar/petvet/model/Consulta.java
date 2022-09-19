package br.com.unipar.petvet.model;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Consulta {
    private int id;
    private String data;
    private String hora;
    private String motivo;
    private double valor;
    private int idAnimal;
    private int idVeterinario;
    private List<Integer> idExames;
    private List<Integer> idMedicamentos;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Consulta() {
    }

    public Consulta(String data, String hora, String motivo, double valor, int idAnimal, int idVeterinario, List<Integer> idExames, List<Integer> idMedicamentos) {
        this.id = count.incrementAndGet();
        this.data = data;
        this.hora = hora;
        this.motivo = motivo;
        this.valor = valor;
        this.idAnimal = idAnimal;
        this.idVeterinario = idVeterinario;
        this.idExames = idExames;
        this.idMedicamentos = idMedicamentos;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public List<Integer> getIdExames() {
        return idExames;
    }

    public void setIdExames(List<Integer> idExames) {
        this.idExames = idExames;
    }

    public List<Integer> getIdMedicamentos() {
        return idMedicamentos;
    }

    public void setIdMedicamentos(List<Integer> idMedicamentos) {
        this.idMedicamentos = idMedicamentos;
    }
}
