package codingbat.string2;

public class PlusOut {
    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;


        while (i < str.length()) {

            if (str.startsWith(word, i)) {

                result.append(word);

                i += word.length();
            } else {

                result.append("+");
                i++;
            }
        }

        return result.toString();
    }
/*Учитывая строку и непустую словесную строку, верните версию исходной строки,
в которой все символы заменены плюсами («+»), за исключением появления словесной строки,
которые сохраняются неизменными.*/
}
