package codingbat.warmup2;

public class Array667 {
    public int array667(int[] nums) {
        int count = 0;
        for(int i=0; i < nums.length-1; i++){
            if(nums[i] == 6 && nums[i + 1] == 6){
                count ++;
            }
            if(nums[i] == 6 && nums[i + 1] == 7){
                count ++;
            }
        }
        return count;
    }
/*Учитывая массив целых чисел, верните количество раз, когда две шестерки находятся рядом
друг с другом в массиве. Также подсчитайте случаи, когда вторая цифра «6» на самом деле
является цифрой 7.*/
}
