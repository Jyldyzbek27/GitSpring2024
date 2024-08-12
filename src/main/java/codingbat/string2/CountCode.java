package codingbat.string2;

public class CountCode {
    public int countCode(String str) {
        int count = 0;
        for(int i=0; i < str.length()-3; i++){
            String str1 = str.substring(i, i+2);
            String str2 = str.substring(i+3, i+4);
            if(str1.equals("co") && str2.equals("e")){
                count ++;
            }
        }
        return count;
    }
/*Возвращает количество раз, когда строка «code» появляется в любом месте данной строки,
за исключением того, что мы принимаем любую букву вместо «d», поэтому «справляться»
и «куе» учитываются.*/
}
