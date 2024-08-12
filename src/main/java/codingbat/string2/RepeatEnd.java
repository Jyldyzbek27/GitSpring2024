package codingbat.string2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String result = "";

        for(int i=0; i < n; i++){
            String sub = str.substring(str.length()-n, str.length());
            result +=sub;
        }
        return result;
    }
/*Учитывая строку и целое число n, верните строку, состоящую из n повторений последних n
символов строки. Вы можете предположить, что n находится в диапазоне от 0 до длины
строки включительно.*/
}
