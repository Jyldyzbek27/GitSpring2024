package codingbat.warmup2;

public class AltPairs {
    public String altPairs(String str) {
        String result = "";
        for(int i=0; i < str.length(); i += 4){
            int end = i +2;
            if(end > str.length()){
                end = str.length();
            }
            result = result + str.substring(i, end);
        }
        return result;
    }
/*Учитывая строку, верните строку, состоящую из символов с индексами 0,1, 4,5, 8,9...
так что "котята" дают "киен".*/
}
