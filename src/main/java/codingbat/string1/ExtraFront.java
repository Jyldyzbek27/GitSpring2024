package codingbat.string1;

public class ExtraFront {
    public String extraFront(String str) {
        String result = "";
        if(str.length() < 2){
            result = str + str + str;
        } else {
            result = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
        return result;
    }

}
