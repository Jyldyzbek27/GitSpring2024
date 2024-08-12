package codingbat.string1;

public class WithoutX2 {
    public String withoutX2(String str) {
        if(str.isEmpty()){
            return "";
        }
        else if(str.length()==1){
            if(str.charAt(0) != 'x')
                return (str.charAt(0) + "");
            else return "";
        }
        String first = str.substring(0, 2);
        String rest = str.substring(2, str.length());
        if(first.charAt(1) != 'x') rest = first.charAt(1) + rest;
        if(first.charAt(0) != 'x') rest = first.charAt(0) + rest;
        return rest;
    }
/*Учитывая строку, если один или оба первых двух символа равны «x»,
верните строку без этих символов «x», а в противном случае
верните строку без изменений. Это немного сложнее, чем кажется.*/
}
