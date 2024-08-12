package codingbat.warmup2;

public class StringX {
    public String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }
/*Учитывая строку, верните версию, в которой все «x» были удалены. За исключением того,
что «x» в самом начале или конце удалять не следует.*/
}
