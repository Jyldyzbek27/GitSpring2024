package codingbat.warmup2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }
/*Учитывая две строки, a и b, верните количество позиций, в которых они содержат
подстроку одинаковой длины 2. Таким образом, «xxcaazz» и «xxbaaz» дают 3,
поскольку подстроки «xx», «aa» и «az» появляются в одном и том же месте в обеих строках.*/
}
