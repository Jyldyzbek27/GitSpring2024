package codingbat.string2;

public class SameStarChar {
    public boolean sameStarChar(String str) {
        for(int i=1; i<str.length()-1; i++){
            if(str.substring(i, i+1).equals("*")){
                if(!str.substring(i-1, i).equals(str.substring(i+1, i+2))){
                    return false;
                }
            }
        }
        return true;
    }
/*Возвращает true, если для каждой '*' (звездочки) в строке, если непосредственно
до и после звезды есть символы, они одинаковы.*/
}
