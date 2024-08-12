package codingbat.string2;

public class MixString {
    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int shortest = 0;
        if(a.length() == b.length()){
            for(int i = 0; i < a.length() ;i++){
                result.append(a.charAt(i)).append(b.charAt(i));

            }
            return result.toString();
        }
        if( a.length() > b.length()){
            for(int i = 0; i < b.length() ;i++){
                result.append(a.charAt(i)).append(b.charAt(i));

            }
            return result.append(a.substring(b.length())).toString();
        }
        if( b.length() > a.length()){
            shortest = b.length() - a.length();
            for(int i = 0; i < a.length() ;i++){
                result.append(a.charAt(i)).append(b.charAt(i));

            }
            return result.append(b.substring(a.length())).toString();
        }
        return result.toString();
    }

}
