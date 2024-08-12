package codingbat.string1;

public class SeeColor {
    public String seeColor(String str) {
        if (str.length() >= 4) {
            String str1 = str.substring(0, 4);
            if(str1.equals("blue")){
                return str1;
            }
        }
        if (str.length() >= 3){
            String str2 = str.substring(0, 3);
            if(str2.equals("red")){
                return str2;
            }
        }

        return "";
    }

}
