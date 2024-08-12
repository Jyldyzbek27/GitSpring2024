package codingbat.string2;

public class XyBalance {
    public boolean xyBalance(String str) {
        int y = -1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='y') y = i;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'x' && i > y) return false;
        }
        return true;
    }
/*Мы скажем, что строка сбалансирована по оси xy, если для всех символов «x» в строке
где-то позже в строке существует символ «y». Итак, «xxy» сбалансирован,
а «xyx» — нет. Один «у» может уравновесить несколько «х».
Возвращает true, если данная строка сбалансирована по оси xy.*/
}
