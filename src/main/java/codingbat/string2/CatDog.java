package codingbat.string2;

public class CatDog {
    public boolean catDog(String str) {
        int cat =0;
        int dog =0;
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i, i+3).equals("cat"))
                cat++;
            if(str.substring(i, i+3).equals("dog"))
                dog++;
        }
        return cat == dog;
    }
/*Возвращает true, если строки «кошка» и «собака» встречаются в данной строке
одинаковое количество раз.*/
}
