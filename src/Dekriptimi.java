public class Dekriptimi {
    // Metoda qe dekripton nje tekst duke perdorur Caesar cipher me nje vlerë te dhene te shift-it
    public static String decrypt(String text, int shift){
        if (shift < 0 || shift > 25) {
            throw new IllegalArgumentException("Vlera e shift duhet të jetë midis 0 dhe 25.");
        }

        StringBuilder result = new StringBuilder();

        for(char ch: text.toCharArray()){
            if(Character.isLetter(ch)){
                char base = Character.isUpperCase(ch)? 'A' : 'a';
                result.append((char) ((ch-base-shift+26) %26 + base));
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Metode shtese: provon te gjitha vlerat e mundshme te shift-it (1 deri 25) per te gjetur dekriptimin e mundshem
    public static void bruteForceDecrypt(String text){
        System.out.println();
        System.out.println("Rezultatet e mundshme për çdo shift:");
        for (int shift = 1; shift < 26; shift++) {
            String decrypted = decrypt(text, shift);
            System.out.println("Shift " + shift + ": " + decrypted);
        }
    }
}
