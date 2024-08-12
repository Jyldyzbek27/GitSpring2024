package codingbat.string2;

public class StarOut {
    public String starOut(String str) {
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == '*'){
                continue;
            } if(i > 0 && str.charAt(i - 1) =='*'){
                continue;
            }if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            sb1.append(str.charAt(i));
        }
        return sb1.toString();
    }
/*Возвращает версию заданной строки, в которой для каждой звездочки (*) в строке
звездочка и символы слева и справа от нее исчезли. Таким образом, «ab*cd» дает «ad»,
а «ab**cd» также дает «ad».V */
}
