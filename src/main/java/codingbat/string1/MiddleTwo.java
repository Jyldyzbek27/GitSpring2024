package codingbat.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int len = str.length();
        int mid1 = len / 2 -1;
        int mid2 = mid1 + 1;
        return str.substring(mid1, mid2 +1);
    }


}
