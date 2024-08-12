package codingbat.string2;

public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        int i = str.length() /2;
        int j = str.length() / 2 -1;
        if(str.length() < 3){
            return false;
        }else if((str.charAt(i - 1) == 'x' && str.charAt(i) == 'y' &&
                str.charAt(i + 1) == 'z') || (str.length() % 2 == 0 &&
                str.charAt(j - 1) == 'x' && str.charAt(j) == 'y' &&
                str.charAt(j + 1) == 'z')){
            return true;
        }
        return false;
    }
/*Учитывая строку, появляется ли «xyz» в середине строки? Чтобы определить средний,
мы скажем, что количество символов слева и справа от «xyz» должно отличаться
не более чем на один. Эта проблема сложнее, чем кажется.*/
}
