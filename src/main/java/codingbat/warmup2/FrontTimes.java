package codingbat.warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        int len = 3;
        if(len > str.length()){
            len = str.length();
        }
        String front = str.substring(0, len);
        String result = "";
        for(int i=0; i < n; i++){
            result = result + front;
        }
        return result;
    }

}
