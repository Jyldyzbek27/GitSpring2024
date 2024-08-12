package codingbat.warmup2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i < n; i++){
            sb1.append(str);
        }
        return sb1.toString();
    }

}
