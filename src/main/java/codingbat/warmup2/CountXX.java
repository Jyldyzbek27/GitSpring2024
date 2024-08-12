package codingbat.warmup2;

public class CountXX {
    int countXX(String str) {
        int count = 0;
        for(int i=0; i <str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx"))
                count ++;

        }
        return count;
    }
/*Подсчитайте количество «xx» в данной строке. Мы скажем, что перекрытие разрешено,
поэтому «xxx» содержит 2 «xx».*/
}
