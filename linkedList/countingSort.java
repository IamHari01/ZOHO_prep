
import java.util.Arrays;

public class countingSort {
    public static int[] cS_algorithm(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        int[] count = new int[max+1];
        for(int i = 0;i<n;i++){
            count[nums[i]]++;
        }
        int index = 0;
        
    
         for(int i = 0;i<=max;i++){
            while(count[i]>0){
                nums[index] = i;
                index++;
                count[i]--;

                
            }
        }
        return nums;

 
    }
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,4,4,6,7,8,8,8,4,2,6,0};
        cS_algorithm(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}