package com.jaume.penjat;

import java.awt.*;

public class penjat {

    public static void main(String[] args) {
        tauler tauler = new tauler();

        String paraula = util.makeQuestion("Selecciona paraula secreta");
        String intents = util.makeQuestion("Quans d'intents tenim");
        while(!util.isNumeric(intents)){
            System.out.println("Has d'introduir un valor numèric");
            intents = util.makeQuestion("Quans d'intents tenim");
        }
        tauler.inicialitzarPartida(paraula, Integer.parseInt(intents));
        System.out.println(tauler.imprimir());
        while (!tauler.hasGuanyat() && tauler.getIntents() > 0){
            System.out.println(tauler.imprimirVides());
            String letra = util.makeQuestion("Indica la lletra");
            System.out.println(tauler.verificar(letra));
            System.out.println(tauler.imprimir());
        }

        if (tauler.hasGuanyat()) {
            System.out.println("Ho has encertat");
        }else{
            System.out.println("Has perdut");
        }
    }

}
