package br.com.unipar.petvet.model;

public class Consulta {
    private int id;
    private String data;
    private String hora;
    private String motivo;
    private String diagnostico;
    private String tratamento;
    private double valor;
    private int idAnimal;
    private int idVeterinario;

    public Consulta() {}

    public Consulta(int id, String data, String hora, String motivo, String diagnostico, String tratamento, double valor, int idAnimal, int idVeterinario) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
        this.valor = valor;
        this.idAnimal = idAnimal;
        this.idVeterinario = idVeterinario;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
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
}
