package codingbat.string1;

public class LastChars {
    public String lastChars(String a, String b) {

        if(a.length()==0){
            a = "@";
        } if(b.length()==0){
            b = "@";
        }
        return a.substring(0,1)+b.substring(b.length()-1);

    }
/*Учитывая две строки, a и b, верните новую строку, состоящую из первого символа a и
последнего символа b, поэтому "yo" и "java" дают "ya". Если длина какой-либо строки равна
0, используйте «@» для отсутствующего символа.*/
}
