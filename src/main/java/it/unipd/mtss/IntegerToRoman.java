////////////////////////////////////////////////////////////////////
// Massimo Chioru 2013449
// Stefano Bressan 1201199
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

/** Creare la classe IntegerToRoman e definire la funzione convert*/
/** implementare la funzione convert */
/** Gestire un input non valido (<1 e >1000) */
public class IntegerToRoman {

    private static final int[] ArrayNumeri = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] ArraySimboli = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV",
            "I" };

    public static String convert(int numeroArabo) {
        try {
            if (numeroArabo < 1) {
                throw new Exception("Numero troppo piccolo < 1!!");
            }
            if (numeroArabo > 1000) {
                throw new Exception("Numero troppo grande > 1000!!");
            }
        } catch (Exception e) {
            System.out.println(e);
            return "Errore";
        }
        StringBuilder risultato = new StringBuilder();

        for (int i = 0; i < ArrayNumeri.length; i++) {
            while (numeroArabo >= ArrayNumeri[i]) {
                risultato.append(ArraySimboli[i]);
                numeroArabo -= ArrayNumeri[i];
            }
        }
        return risultato.toString();
    }
}