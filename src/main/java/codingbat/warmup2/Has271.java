package codingbat.warmup2;

public class Has271 {
    public boolean has271(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];
            if (nums[i+1] == (val+5) &&
                    Math.abs(nums[i+2] - (val-1)) <= 2) {
                return true;
            }
        }


        return false;
    }

/*Учитывая массив целых чисел, верните true, если он содержит шаблон 2, 7, 1:
значение, за которым следует значение плюс 5, за которым следует значение минус 1.
Кроме того, 271 учитывается, даже если «1» отличается на 2 или меньше правильного
значения.*/
}
