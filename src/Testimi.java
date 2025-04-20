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

        System.out.println("\n-----------------------------\n");

        // Testimi 3: Testimi per vlere jo valide te shift

        try{
            String  testimi3 = "Pershendetje Une Jam Erik Behrami!";
            int shift3 = 27;

            String enkriptimiTestimi3 = Enkriptimi.encrypt(testimi3, shift3);
            String dekriptimiTestimi3 = Dekriptimi.decrypt(testimi3, shift3);

            System.out.println("Teksti origjinal: " + testimi3);
            System.out.println("Teksti i enkriptuar me shift " + shift3 + ": " + enkriptimiTestimi3);
            System.out.println("Teksti i dekriptuar: " + dekriptimiTestimi3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}



