package codingbat.string2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String result = "";
        for(int i=n;n>0; n--){
            String sub = str.substring(0, n);
            result += sub;
        }
        return result;
    }
/*Учитывая строку и целое число n, верните строку, состоящую из первых n символов строки,
за которыми следуют первые n-1 символов строки и так далее. Вы можете предположить,
что n находится в диапазоне от 0 до длины строки включительно
(т.е. n >= 0 и n <= str.length()).*/

}
