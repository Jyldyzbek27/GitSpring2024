package codingbat.warmup2;

public class NoTriples {
    public boolean noTriples(int[] nums) {
        for(int i =0; i < nums.length-1; i++){
            if(nums.length > 2){
                if(nums[i] == nums[i+1] && nums[i+1] == nums[i + 2]){
                    return false;
                }
            }

        }
        return true;
    }
/*Учитывая массив целых чисел, мы скажем, что тройка — это значение, появляющееся в
массиве 3 раза подряд. Возвращайте true, если массив не содержит троек.*/
}
