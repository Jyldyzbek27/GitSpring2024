package codingbat.string1;

public class ConCat {
    public String conCat(String a, String b) {
        if(a.isEmpty()){
            return b;}
        else if(b.isEmpty()){
            return a;
        } else if(a.charAt(a.length()-1) == b.charAt(0)){
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }

}
