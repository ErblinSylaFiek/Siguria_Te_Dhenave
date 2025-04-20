public class Testimi {
    public static void main(String[] args){
        // Testimi 1: Me simbole
        String fjaliMeSimbole = "Pershendetje123.Une jam Erblin Syla@#";
        int shift = 5;

        String enkriptimiSimbol = Enkriptimi.encrypt(fjaliMeSimbole, shift);
        String dekriptimiSimbol = Dekriptimi.decrypt(enkriptimiSimbol, shift);

        System.out.println("Teksti me simbole: " + fjaliMeSimbole);
        System.out.println("Teskti i enkriptuar me shift " + shift + ": " + enkriptimiSimbol);
        System.out.println("Teksi i dekriptuar: " + dekriptimiSimbol);

        if (fjaliMeSimbole.equals(dekriptimiSimbol)) {
            System.out.println("Testimi per simbole kaloi me sukses, simbolet nuk jane ndryshu!");
        } else {
            System.out.println("Testi deshtoi, simbolet jane ndryshu!");
        }

        System.out.println("\n-----------------------------\n");

        // Testimi 2: Me shkronja te medha/te vogla + hapesira
        String fjaliCase = "Pershendetje Une Jam Ereza Greicevci!";
        int shift2 = 3;

        String enkriptuarCase = Enkriptimi.encrypt(fjaliCase, shift2);
        String dekriptuarCase = Dekriptimi.decrypt(enkriptuarCase, shift2);

        System.out.println("Teksti origjinal: " + fjaliCase);
        System.out.println("Teksti i enkriptuar me shift " + shift2 + ": " + enkriptuarCase);
        System.out.println("Teksti i dekriptuar: " + dekriptuarCase);

        if (fjaliCase.equals(dekriptuarCase)) {
            System.out.println("Testimi per shkronja & case kaloi me sukses!");
        } else {
            System.out.println("Testimi per shkronja & case deshtoi.");
        }
    }
}
