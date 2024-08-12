package codingbat.string2;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for(int i=0; i < count; i++){
            if(i < count -1)
                result += word + sep;
            else result += word;
        }
        return result;
    }
/*Учитывая две строки, слово и разделитель sep, верните большую строку,
состоящую из нескольких вхождений слова, разделенных строкой-разделителем.*/
}
