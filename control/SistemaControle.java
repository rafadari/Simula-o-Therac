package control;

import model.*;

public class SistemaControle {
    public boolean validarDose(double planejada, double aplicada) {
        System.out.println("Validando dose...");

        if (aplicada > planejada) {
            System.out.println("ERRO: Superdosagem detectada!");
            return false;
        }

        System.out.println("Dose dentro do permitido.");
        return true;
    }

    public void iniciarSessao(Maquina maquina, Sessao sessao, double dose) {
        System.out.println("Iniciando sessão...");
        maquina.aplicarRadiacao(sessao, dose);
    }

    public void pararSessao() {
        System.out.println("Sessão interrompida!");
    }

    public void emitirAlerta() {
        System.out.println("ALERTA: Falha crítica na radiação!");
    }
}
