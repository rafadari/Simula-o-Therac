package model;

public class Tratamento {
    private double dosePlanejada;
    private String tipo;

    public Tratamento(double dosePlanejada, String tipo) {
        this.dosePlanejada = dosePlanejada;
        this.tipo = tipo;
    }

    public double getDosePlanejada() {
        return dosePlanejada;
    }
}
