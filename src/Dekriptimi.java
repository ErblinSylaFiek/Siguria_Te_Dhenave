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
}
