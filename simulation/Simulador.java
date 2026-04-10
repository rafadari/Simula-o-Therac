package simulation;

import model.*;
import control.*;

public class Simulador {
    public static void executar() {

        Paciente paciente = new Paciente(1, "João", 50);
        Tratamento tratamento = new Tratamento(50.0, "Radioterapia");
        Sessao sessao = new Sessao("10/04/2026");

        Maquina maquina = new Maquina();
        SistemaControle controle = new SistemaControle();

        double doseAplicada = 80.0;

        System.out.println("Paciente: " + paciente.getNome());

        controle.iniciarSessao(maquina, sessao, doseAplicada);

        boolean valida = controle.validarDose(
                tratamento.getDosePlanejada(),
                sessao.getDoseAplicada()
        );

        if (!valida) {
            controle.pararSessao();
            controle.emitirAlerta();
        }

        System.out.println("Status da sessão: " + sessao.getStatus());
    }
}
