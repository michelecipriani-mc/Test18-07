package Esercizio16;

import java.util.ArrayList;
import java.util.Scanner;

public class GestioneVeicolo {
    public static void main(String[] args) {
        //dichiaro un arraylist di veicoli
        ArrayList<Veicolo> veicoli = new ArrayList<>();
        //dichiaro uno scanner
        Scanner myScannerInt = new Scanner(System.in);
        Scanner myScannerStr = new Scanner(System.in);

        //dichiaro una variabile di scelta
        int scelta;
        //ciclo do while per gestire il menù
        do {
            //menù
            System.out.println("--- Menu Gestione Veicoli ---");
            System.out.println("1. Aggiungi Auto");
            System.out.println("2. Aggiungi Moto");
            System.out.println("3. Visualizza dettagli veicoli");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");
            //valorizzo la scelta 
            scelta = myScannerInt.nextInt();
            //switch per la gestione della scelta
            switch (scelta) {
                case 1:
                //aggiungi automobile
                    aggiungiAuto(veicoli, myScannerStr, myScannerInt);
                    break;
                case 2:
                //aggiungi moto
                    aggiungiMoto(veicoli, myScannerStr, myScannerInt);
                    break;
                case 3:
                //stampa veicoli
                    visualizzaVeicoli(veicoli, myScannerStr, myScannerInt);
                    break;
                case 4:
                //uscita
                    System.out.println("Programma terminato!");
                    break;
                default:
                //gestione dell'errore
                    System.out.println("Opzione non valida...");
            }
        } while (scelta != 4);//verifica della condizione
        //chiusura sacnner
        myScannerStr.close();
        myScannerInt.close();
    }
    //creo la funzione aggiungi auto
    private static void aggiungiAuto(ArrayList<Veicolo> veicoli,Scanner myScannerStr, Scanner myScannerInt) {
        //chiedo tutti i dati in input
        System.out.print("Inserisci marca Auto: ");
        String marca = myScannerStr.nextLine();
        System.out.print("Inserisci anno Auto: ");
        int anno = myScannerInt.nextInt();
        System.out.print("Inserisci numero porte: ");
        int porte = myScannerInt.nextInt();
        //creo l'oggetto auto 
        Auto auto = new Auto(marca, anno, porte);
        //lo aggiungo all'arraylist
        veicoli.add(auto);
        //stampo avvenuta aggiunta con successo
        System.out.println("Auto aggiunta con successo!");
    }
    //creo la funzione aggiungi moto
    private static void aggiungiMoto(ArrayList<Veicolo> veicoli,Scanner myScannerStr, Scanner myScannerInt) {
        //chiedo tutti i dati in input
        System.out.print("Inserisci marca Moto: ");
        String marca = myScannerStr.nextLine();
        System.out.print("Inserisci anno Moto: ");
        int anno = myScannerInt.nextInt();
        System.out.print("Ha carenatura? (1=Sì, 0=No): ");
        int carenaturaInt = myScannerInt.nextInt();
        //definisco se la moto ha carenatura o meno
        boolean haCarenatura = (carenaturaInt == 1);
        //creo l'oggetto moto
        Moto moto = new Moto(marca, anno, haCarenatura);
        //lo aggiungo ai veicoli
        veicoli.add(moto);
        //stampo moto aggiunta con successo
        System.out.println("Moto aggiunta con successo!");
    }
    //creo la funzione per visualizzare tutti i veicoli
    private static void visualizzaVeicoli(ArrayList<Veicolo> veicoli,Scanner myScannerStr, Scanner myScannerInt) {
        //verifico se l'arraylist è vuoto
        if (veicoli.isEmpty()) {
            //se vuoto stampo nessun veicolo presente
            System.out.println("Nessun veicolo presente.");
        //altrimenti
        } else {
            //ciclo l'arraylist e stampo ogni singolo veicolo
            System.out.println("---Dettagli Veicoli---");
            for (Veicolo v : veicoli) {
                System.out.println(v.dettagli());
            }
        }

    }
}
