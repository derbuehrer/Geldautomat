package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Eingaben des Kontostandes und des abzuhebenden Geldes
	    int guthaben = Einzahlung.einzahlen();
	    int abheben = Abhebung.abheben();

	    // Berechnung der beiden Metoden wie das Geld ausgegeben werden kann
	    Berechnung.berechne(abheben);
	    Berechnung.berechne2(abheben);

	    // Prüfung ob man kein Geld auf dem Konto hat, zu viel abgehoben hat oder noch etwas Restgelt verbleibt
	    if (guthaben - abheben == 0) JOptionPane.showMessageDialog(null,"Auf Ihrem Konto befindet sich nun kein Geld mehr!");
	    else if (guthaben - abheben < 0) JOptionPane.showMessageDialog(null,"Sie sind nun im Rückstand");
	    else {
	        guthaben -= abheben;
            JOptionPane.showMessageDialog(null,"Ihr aktueller Kontostand beträgt: " + guthaben + "€");
        }
    }
}