public class Dekriptimi {
    public static String decrypt(String text, int shift){
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

    //Metode shtese: brute force decrypt
    public static void bruteForceDecrypt(String text){
        System.out.println();
        System.out.println("Rezultatet e mundshme për çdo shift:");
        for (int shift = 1; shift < 26; shift++) {
            String decrypted = decrypt(text, shift);
            System.out.println("Shift " + shift + ": " + decrypted);
        }
    }
}
