
import java.util.Arrays;

class MergeTwoSortedArrays {
    public int[] mergeTwoSortedArraysBrute(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int left = 0;
        int right = 0;
        int index = 0;
        int[] arr3 = new int[n+m];
        while(left<n && right<m){
            if(arr1[left] <= arr2[right]){
                arr3[index++] = arr1[left++];
                // int temp = arr1[left];
                // arr1[left] = arr2[right];
                // arr2[right] = temp;
            }else{
                arr3[index++] = arr2[right++];
            }

        }
        while(left<n){
            arr3[index++] = arr1[left++];
        }
        while(right<m){
            arr3[index++] = arr2[right++];
        }

        return arr3;
    }

    public void  mergeTwoSortedArraysOptimal(int[] arr1,int[] arr2){
        //Insertion sorting method:
        int n = arr1.length;
        int m = arr2.length;
        int left = n-1;
        int right = 0;
        while(left>=0 && right<m){
            if(arr1[left] > arr2[right] ){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }else{
                break;

            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    //Gap method:
    public void mergeTwoSortedArraysOptimalWithGap(int[] arr, int[] arr2){


    }
}