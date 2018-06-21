package com.company;

public class Ausgabe {

    // StringBuilder für die Ausgabe
    protected static StringBuilder sb = new StringBuilder();

    public static String ausgeben(int[] anzahl, int[] scheine) {

        // Zurücksetzen des StringBuilders
        sb.replace(0, sb.length(), "");
        for (int i = 0; i < 7; i++) {

            // Es werden nur verwendete Scheine ausgegeben
            if (anzahl[i] != 0) {
                sb.append(anzahl[i]);
                sb.append("x");
                sb.append(scheine[i]);
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}