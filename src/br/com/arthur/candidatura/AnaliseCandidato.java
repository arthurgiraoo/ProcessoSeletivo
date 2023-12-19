package br.com.arthur.candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AnaliseCandidato {
    private double salarioBase = 2000.0;
    private double salarioPretendido;

    public AnaliseCandidato( double salarioPretendido) {
        this.salarioPretendido = salarioPretendido;
    }

    public double getSalarioPretendido() {
        return salarioPretendido;
    }

    public void analisarCandidato(double salarioPretendido){
        if (salarioPretendido > this.salarioBase){
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }else if(salarioPretendido == this.salarioBase){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRAPROPOSTA");
        }else {
            System.out.println("LIGAR PARA O CANDIDATO");
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }

    static void selecaoDeCandidatos(){
        String [] candidatos = {"JOÃO","MATHEUS","ALICE","FERNANDO","LUCAS","CLARA","EDNA","THIAGO"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
             double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato +" solicitou este valor: "+salarioPretendido);
            if (salarioPretendido <= salarioBase){
                System.out.println("O candidato "+ candidato +" foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void imprimeCandidatos(){
        String [] candidatos = {"JOÃO","MATHEUS","ALICE","FERNANDO","LUCAS"};
        for (String candidatos3:candidatos) {
            System.out.println("O candidato selecionado foi: "+candidatos3);
        }
    }
    //auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTetando = true;
        boolean atendeu = false;
        do {
             atendeu = atender();
             continuarTetando = !atendeu;
             if (continuarTetando){
                 tentativasRealizadas++;
             }else {
                 System.out.println("CONTATO REALIZADO COM SUCESSO");
             }

        }while (continuarTetando && tentativasRealizadas<3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM O "+candidato+" NA "+ tentativasRealizadas+" TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO "+candidato+" COM O NUMERO MAXIMO DE " +
                    "TENTATIVAS: "+ tentativasRealizadas);
        }
    }

}


