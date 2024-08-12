package codingbat.string2;

public class WordEnds {
    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while((index = str.indexOf(word, index)) != -1){
            if(index > 0){
                result.append(str.charAt(index - 1));

            } index += word.length();
            if(index < str.length()){
                result.append(str.charAt(index));
            }

        }
        return result.toString();
    }
/*Учитывая строку и непустую строку слов, верните строку, состоящую из каждого символа,
непосредственно перед и сразу после каждого появления слова в строке. Игнорируйте случаи,
когда перед или после слова нет символа, а символ может быть включен дважды, если он
находится между двумя словами.*/
}
