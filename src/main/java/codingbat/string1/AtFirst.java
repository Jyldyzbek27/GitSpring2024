package codingbat.string1;

public class AtFirst {
    public String atFirst(String str) {
        if(str.length()>= 2){
            return str.substring(0, 2);
        } else if(str.length()<1){
            return str.concat("@@");
        }
        else{
            return str.concat("@");
        }

    }
/*Учитывая строку, верните строку длиной 2, состоящую из первых двух символов.
Если длина строки меньше 2, используйте «@» для отсутствующих символов.*/
}
