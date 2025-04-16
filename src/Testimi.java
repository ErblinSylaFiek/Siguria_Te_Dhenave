public class Testimi {
    public static void main(String[] args){
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
    }
}
