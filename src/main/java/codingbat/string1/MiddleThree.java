package codingbat.string1;

public class MiddleThree {
    public String middleThree(String str) {
        if(str.length() <= 3) return str;
        int index = str.length() / 2;
        return str.substring(index -1, index +2);
    }

}
