package com.company;


import javax.swing.*;

public class Berechnung {

    // Definierung welche Scheine es gibt
    protected final static int[] scheine = {5, 10, 20, 50, 100, 200, 500};

    public static void berechne(int abhebung) {

        // Hilfsvariable und Array zur Kontrolle des "scheine" Arrays iniziiert
        int hilfvar = 6;
        int[] anzahl = new int[7];
        while (abhebung > 0) {
            // Nach größtmöglichen Schein sortiert (500 bis 5)
            if (abhebung >= scheine[hilfvar]) {
                anzahl[hilfvar]++;
                abhebung -= scheine[hilfvar];
            } else hilfvar--;
        }

        // Ausgabe des Resultats
        String sb = Ausgabe.ausgeben(anzahl, scheine);
        JOptionPane.showMessageDialog(null,"Option a) " + sb);
    }
    public static void berechne2(int abhebung) {

        // Hilfsvariable und Array zur Kontrolle des "scheine" Arrays iniziiert
        int hilfvar = 0;
        int[] anzahl = new int[7];
        while (abhebung > 0) {
            // Jeder Schein von 5 bis 500 wird hoch gezählt (sofern möglich) bis alle Scheine zusammen dem Wert der Abhebung entsprechen
            if (abhebung >= scheine[hilfvar]) {
                anzahl[hilfvar]++;
                abhebung -= scheine[hilfvar];
            }
            // Entgegengesetzte Reihenfolge zu "berechne()"
            hilfvar++;
            if (hilfvar == 7) hilfvar = 0;
        }

        // Ausgabe des Resultats
        String sb = Ausgabe.ausgeben(anzahl, scheine);
        JOptionPane.showMessageDialog(null,"Option b) " + sb);
    }
}