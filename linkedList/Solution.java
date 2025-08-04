class Solution {
    public void merge(int[]arr ,int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int left  = low;
        int k = 0;
        int right = mid+1 ;
        while(left<=mid && right<=high){
            if(arr[left]<= arr[right]){
                temp[k++] = arr[left++];

            }else{
                temp[k++] = arr[right++];
            }

        }
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        while(right<=high){
            temp[k++] = arr[right++];
        }

        System.arraycopy(temp, 0, arr, low, temp.length);


    } 


  public void mergeSort(int[] arr,int low, int high){
    if(low >= high) return;

    int mid  =  low + (high-low)/2;

    mergeSort(arr, low, mid);
    mergeSort(arr,mid+1,high);
    merge(arr,low,mid,high);

  }
}