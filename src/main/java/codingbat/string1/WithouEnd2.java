package codingbat.string1;

public class WithouEnd2 {
    public String withouEnd2(String str) {
        String result = "";
        if(str.length() <= 2){
            result = "";
        }
        else {
            String str1 = str.substring(1, str.length()-1);
            result = str1;
        }
        return result;
    }

}
