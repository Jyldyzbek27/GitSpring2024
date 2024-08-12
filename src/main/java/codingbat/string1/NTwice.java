package codingbat.string1;

public class NTwice {
    public String nTwice(String str, int n) {
        String result = "";
        for(int i=0; i < n; i++){
            result += str.charAt(i);
        }
        for(int i = str.length()-n; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

}
