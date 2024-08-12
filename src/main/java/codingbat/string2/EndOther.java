package codingbat.string2;

public class EndOther {
    public boolean endOther(String a, String b) {
        if(a.length() < b.length()){
            String str = a;
            a = b.toLowerCase();
            b = str.toLowerCase();
        }
        return a.substring(a.length() - b.length()).equals(b);
    }
/*Учитывая две строки, верните true, если одна из строк находится в самом конце другой
строки, игнорируя различия в верхнем и нижнем регистре (другими словами, вычисление не
должно быть «чувствительным к регистру»). Примечание. str.toLowerCase() возвращает версию
строки в нижнем регистре.*/
}
