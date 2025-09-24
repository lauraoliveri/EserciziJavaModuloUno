
public class ElementoDiMaggioranza {
    public static void main(String[] args) {

        int[] numeri = {4, 4, 2, 4, 7, 4, 4, 9, 4, 1, 4, 3, 4};

        // creo un array per salvare il n di volte che un numero viene ripetuto
        int[] volte = new int[50];

        for (int i = 0; i < numeri.length; i++) {
           volte[numeri[i]]++; // alla posizione del numero dell array si aggiunge 1 ( per capire quante volte viene ripetuto)
        }

        for (int j = 0; j < volte.length; j++) {
            if ( volte[j] > numeri.length / 2){
                System.out.println("L'elemento di maggioranza è " + j );
                System.out.println(j + " è ripetuto " + volte[j] + " volte");
            }
        }
    }
}

/*
Scrivere un programma Java per ottenere l'elemento di maggioranza
da un lato array di interi contenenti duplicati.
Elemento di maggioranza: un elemento di maggioranza è un elemento
che appare più di n / 2 volte dove n è la dimensione dell'array
 */