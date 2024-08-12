package codingbat.string2;

public class ZipZap {
    public String zipZap(String str) {
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i < str.length(); i++){
            sb1.append(str.charAt(i));
            if(str.charAt(i) == 'z' && i < str.length() -2 && str.charAt(i+2) == 'p'){

                sb1.append(str.charAt(i+2));
                i += 2;
            }
        }
        return sb1.toString();
    }
/*Ищите такие шаблоны, как «zip» и «zap» в строке длиной-3, начиная с «z» и заканчивая
«p». Возвращает строку, в которой для всех таких слов отсутствует средняя буква,
поэтому «zipXzap» дает «zpXzp».*/

//str.charAt(i) == 'z' && str.charAt(i+2) == 'p'
}
