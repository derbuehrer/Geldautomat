package com.company;

import javax.swing.*;

public class Einzahlung {

    public static int einzahlen() {

        int einzahlen = 0;
        String eingabe = "";
        while (true) {
            // Eingabe erfolgt
            eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie ein wie viel Sie einzahlen wollen");
            // Prüfung ob der String leer ist (abbrechen)
            if (eingabe == null) System.exit(0);

            // String to Int
            try {
                einzahlen = Integer.parseInt(eingabe);
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Das ist kein gültiger Wert");
                continue;
            }

            // Weniger als 1€ kann man nicht einzahlen
            if (einzahlen < 1) {
                JOptionPane.showMessageDialog(null,"Sie können nicht weniger als 1€ einzahlen");
                einzahlen = 1;
            }
            return einzahlen;
        }
    }
}