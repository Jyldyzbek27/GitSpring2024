package codingbat.string2;

public class OneTwo {
    public String oneTwo(String str) {
        StringBuilder sb1 = new StringBuilder();

        for(int i=0; i<str.length()-2; i+=3){

            sb1.append(str.charAt(i+1));
            sb1.append(str.charAt(i+2));
            sb1.append(str.charAt(i));
        }
        return sb1.toString();
    }
/*Учитывая строку, вычислите новую строку, переместив первый символ,
следующий за следующими двумя символами, так что «abc» дает «bca».
Повторите этот процесс для каждой последующей группы из 3 символов,
чтобы «abcdef» давало «bcaefd». Игнорируйте любую группу, содержащую
менее 3 символов в конце.*/
}
