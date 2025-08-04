
import java.util.HashMap;

class KeyPair {
    static boolean keyPair(int[] arr, int target){
        HashMap <Integer, Integer> map = new HashMap<> ();
        int complement = 0;
        for(int i= 0;i<arr.length;i++){
            complement = target-arr[i];
            if(map.containsKey(complement)){
                return true;
            }
            map.put(arr[i],i);

        }




        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,1,6,8};
        int target = 12;
        boolean result = keyPair(arr, target);
        // System.out.println(Arrays.toString(result));
        System.out.println(result);
    }
}