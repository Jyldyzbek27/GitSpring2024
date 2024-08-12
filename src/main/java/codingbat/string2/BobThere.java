package codingbat.string2;

public class BobThere {
    public boolean bobThere(String str) {
        for(int i =0; i<str.length()-2; i++){
            String str1 = str.substring(i, i+1);
            String str2 = str.substring(i+2, i+3);
            if(str1.equals("b")&& str2.equals("b")){
                return true;
            }
        }
        return false;
    }
/*Возвращает true, если данная строка содержит строку «bob», но где средний
символ «o» может быть любым символом.*/
}
