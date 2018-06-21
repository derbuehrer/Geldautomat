package com.company;

import javax.swing.*;

public class Abhebung {

    public static int abheben() {

        int abheben = 0;
        String eingabe = "";
        while (true) {
            // Eingabe erfolgt
            eingabe = JOptionPane.showInputDialog(null,"Wieviel möchten Sie jetzt abheben?");
            // Prüfung ob der String leer ist (abbrechen)
            if (eingabe == null) System.exit(0);

            // String to Int
            try {
                abheben = Integer.parseInt(eingabe);
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Das ist kein gültiger Wert");
                continue;
            }

            // Ist der Wert durch 5 ganz Teilbar?
            if (abheben % 5 == 0) {
                return abheben;
            }
            else {
                JOptionPane.showMessageDialog(null,"Wir können Ihnen nur Beträge in 5€ Schritten ausgeben");
            }
        }
    }
}