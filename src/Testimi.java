public class Testimi {
    public static void main(String[] args){
        String fjaliMeSimbole = "Pershendetje123.Une jam Erblin Syla@#";
        int shift = 5;

        String enkriptimiSimbol = Enkriptimi.encrypt(fjaliMeSimbole, shift);
        String dekriptimiSimbol = Dekriptimi.decrypt(enkriptimiSimbol, shift);
    }
}
