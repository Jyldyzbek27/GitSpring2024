package codingbat.string1;

public class DeFront {
    public String deFront(String str) {
        String subs = str.substring(2, str.length());
        if(str.charAt(1) == 'b')  subs = 'b' + subs;
        if(str.charAt(0) == 'a')  subs = 'a' + subs;
        return subs;
    }

/*Учитывая строку, верните версию без первых двух символов.
За исключением сохранения первого символа, если это «a», и сохранения второго символа,
если это «b». Строка может быть любой длины. Сложнее, чем кажется.*/
}
