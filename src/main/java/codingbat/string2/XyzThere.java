package codingbat.string2;

public class XyzThere {
    public boolean xyzThere(String str) {
        if(str.length() < 3) return false;
        if(str.indexOf("xyz") == 0) return true;
        for(int i=1; i <= str.length()-3; i++){
            String str1 = str.substring(i, i+3);
            if(str1.equals("xyz") && str.charAt(i-1) != '.')
                return true;
        }
        return false;
    }

}
