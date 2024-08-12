package codingbat.string1;

public class MinCat {
    public String minCat(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if(len1 == len2){

        }
        else if(len1 > len2){
            int sub = len1 - len2;
            a = a.substring(sub, a.length());
        }
        else if(len1 < len2){
            int sub = len2 - len1;
            b = b.substring(sub, b.length());
        }
        return a + b;

    }

/*Учитывая две строки, соедините их вместе (так называемая «конкатенация»)
и верните результат. Однако если строки имеют разную длину, опустите символы
из более длинной строки, чтобы она имела ту же длину, что и более короткая строка.
Таким образом, «Привет» и «Привет» дают «loHi». Строки могут быть любой длины.*/
}
