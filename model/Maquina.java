package model;

public class Maquina {
    private String estado;

    public Maquina() {
        this.estado = "PRONTA";
    }

    public void aplicarRadiacao(Sessao sessao, double dose) {
        System.out.println("Máquina: Aplicando radiação...");
        sessao.aplicarDose(dose);
    }
}
