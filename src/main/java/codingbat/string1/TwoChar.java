package codingbat.string1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if(str.length() - index < 2 || index < 0 ){
            return str.substring(0, 2);
        } else{
            return str.substring(index, index + 2);
        }
    }
/*Учитывая строку и индекс, верните длину строки 2, начиная с заданного индекса.
Если индекс слишком велик или слишком мал для определения длины строки 2,
используйте первые 2 символа. Длина строки будет не менее 2.*/
}
