public class Enkriptimi {
    // Metoda qe enkripton tekstin duke perdorur Caesar cipher me nje vlere te caktuar te shift-it
    public static String encrypt(String text, int shift) {
        if (shift < 0 || shift > 25) {
            throw new IllegalArgumentException("Vlera e shift duhet të jetë midis 0 dhe 25.");
        }

        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                result.append((char) ((ch - base + shift) % 26 + base));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
