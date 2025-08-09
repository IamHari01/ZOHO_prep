
import java.util.HashMap;

class LongestSubarrayWithK_XOR {
    public long solution(int[] nums, int k){
        int xr = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(xr,1);

        long cnt = 0L;

        for(int j =0; j<nums.length;j++){
            xr ^=nums[j];
            //from  begining to j
            int need_x = xr ^ k;
            cnt += map.getOrDefault(need_x,0);

            //if there's not the element:
            //then put it up
            map.put(xr,map.getOrDefault(xr,0)+1);

        }

        return cnt;
    } 
    public static void main(String[] args) {
        
    }
}