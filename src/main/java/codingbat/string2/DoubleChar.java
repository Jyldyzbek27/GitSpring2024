package codingbat.string2;

public class DoubleChar {
    public String doubleChar(String str) {
        String result = "";
        for(int i=0; i < str.length(); i++){
            result += str.substring(i, i+1) + str.substring(i, i+1);
        }
        return result;
    }
/*Учитывая строку, верните строку, в которой на каждый символ в оригинале приходится
два символа.*/
}
