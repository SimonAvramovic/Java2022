package at.ac.htlstp.sj222a.einf;

import java.util.Scanner;

/**
 *Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 * Lies vom Benutzer 2 Widerstände ein und berechne danach den Parallel und den Serienersatzwiderstand.
 * Die Ausgabe soll in wie folgt aussehen:
 * Serie : 34,53 Ohm
 * Parallel : 13,42 Ohm
 */
public class Temperaturumrechnung {
    public static void main(String[] args) {
        // Deklarationen
        double r1,r2,rSerie,rParallel;
        Scanner sc;
        // Initialisieren
        sc = new Scanner(System.in);
        // Einlesen der Werte
        System.out.print("Gib den ersten Widerstand ein:");
        r1 = sc.nextDouble();
        System.out.print("R2=");
        r2 = sc.nextDouble();
        // Berechnung
        rSerie = r1+r2;
        rParallel=(r1*r2)/(r1+r2);
        System.out.printf("Serie :  %8.2f Ohm\n",rSerie);
        System.out.printf("ParalleL : %8.2f Ohm\n",rParallel);
        // Aufräumen
        sc.close();
    }
}
