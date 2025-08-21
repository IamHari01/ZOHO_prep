
import java.util.Arrays;

class ShortestJobFIrst {
    public int shortestJobFIrst(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int totalTime = 0;
        int waitingTime = 0;

        for(int i = 0;i<n;i++){
            waitingTime += totalTime;

            totalTime += arr[i];


        }

        return waitingTime/n;
    }
    

}