package codingbat.string2;

public class GetSandwich {
    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        return first == last? "" : str.substring(first +5, last);

    }
/*Сэндвич — это два куска хлеба, между которыми есть что-то среднее.
Верните строку, которая находится между первым и последним появлением слова «хлеб»
в данной строке, или верните пустую строку «», если нет двух кусков хлеба.*/
}
