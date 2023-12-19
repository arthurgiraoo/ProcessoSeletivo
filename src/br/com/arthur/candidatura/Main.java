package br.com.arthur.candidatura;

import static br.com.arthur.candidatura.AnaliseCandidato.*;

public class Main {
    public static void main(String[] args) {
        AnaliseCandidato candidato = new AnaliseCandidato(200.0);
        candidato.analisarCandidato(candidato.getSalarioPretendido());

        AnaliseCandidato candidato1 = new AnaliseCandidato(2000.0);
        candidato.analisarCandidato(candidato1.getSalarioPretendido());

        AnaliseCandidato candidato2 = new AnaliseCandidato(3000.0);
        candidato.analisarCandidato(candidato2.getSalarioPretendido());

        //selecaoDeCandidatos();
        imprimeCandidatos();
        String [] candidatos = {"JOÃO","MATHEUS","ALICE","FERNANDO","LUCAS"};
        for (String candidatosla: candidatos) {
            entrandoEmContato(candidatosla);
        }

    }
}