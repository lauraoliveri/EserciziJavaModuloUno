public class Esercizio2 {
    public static void main(String[] args){


        int[] myArr = {5, 22, 4, 8, 21, 3, 35, 87, 7};

        int piccolo1 = myArr[0];

        for (int i = 1; i < myArr.length; i++) {
            if ( myArr[i] < piccolo1){
                piccolo1 = myArr[i];
            }
        }

        int piccolo2 = 0;

        /*
         se il numero più piccolo si dovesse trovare alla posizione 0, il secondo for non funzionerebbe, quindi trovo il primo numero
         diverso dal più piccolo
         */
        for (int i = 0; i < myArr.length; i++) { //
            if ( myArr[i] != piccolo1){
                piccolo2 = myArr[i];
                break; // esco quando trovo il primo numero diverso da piccolo1
            }
        }

        for (int i = 1; i < myArr.length; i++) {
            if ( myArr[i] < piccolo2 && myArr[i] != piccolo1){
                piccolo2 = myArr[i];
            }
        }

        System.out.println("Il numero più piccolo è: " + piccolo1);
        System.out.println("Il secondo numero più piccolo è: " + piccolo2);

    }

}

/*
 Scrivete un programma Java per trovare il più piccolo e il secondo più piccolo elemento di un dato array.
 */