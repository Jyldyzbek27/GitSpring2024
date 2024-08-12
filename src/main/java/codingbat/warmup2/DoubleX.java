package codingbat.warmup2;

public class DoubleX {
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if(i == -1) return false;
        if(i+1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");
    }
/*Учитывая строку, верните true, если за первым экземпляром «x» в строке сразу
следует другой «x».*/
}
