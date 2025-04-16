public class Main {
    public static void main(String[] args) {
        String originalText = "Hello, World!";
        int shift = 4;

        String encryptedText = Enkriptimi.encrypt(originalText, shift);
        String decryptedText=Dekriptimi.decrypt(encryptedText,shift);

        System.out.println("Original Text: " + originalText);
        System.out.println("Encrypted Text: " + encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);
        Dekriptimi.bruteForceDecrypt(encryptedText);
    }
}