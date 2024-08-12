package codingbat.string1;

public class WithoutX {
    public String withoutX(String str) {
        if(str.length() > 0 && str.charAt(0) == 'x'){
            str = str.substring(1, str.length());
        }
        if(str.length() > 0 && str.charAt(str.length() - 1) == 'x'){
            str = str.substring(0, str.length()-1);
        }
        return str;
    }

/*Учитывая строку, если первый или последний символ равен «x»,
верните строку без этих символов «x», в противном
случае верните строку без изменений.*/


}
