package model;

public class Sessao {
    private String data;
    private double doseAplicada;
    private String status;

    public Sessao(String data) {
        this.data = data;
        this.status = "AGENDADA";
    }

    public void aplicarDose(double dose) {
        this.doseAplicada = dose;
        this.status = "INTERROMPIDA";
    }

    public double getDoseAplicada() {
        return doseAplicada;
    }

    public String getStatus() {
        return status;
    }
}
