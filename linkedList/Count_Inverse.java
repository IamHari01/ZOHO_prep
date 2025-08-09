class Count_Inverse {

   
   
        public int merge(int[]arr ,int low, int mid, int high){
            int count = 0;
            int[] temp = new int[high-low+1];
            int left  = low;
            int k = 0;
            int right = mid+1 ;
            while(left<=mid && right<=high){
                if(arr[left]<= arr[right]){
                    temp[k++] = arr[left++];
    
                }else{
                    temp[k++] = arr[right++];
                    count += (mid-left+1);
                }
    
            }
            while(left<=mid){
                temp[k++] = arr[left++];
            }
            while(right<=high){
                temp[k++] = arr[right++];
            }
    
            System.arraycopy(temp, 0, arr, low, temp.length);

            return count;
    
    
        } 
    
    
      public int mergeSort(int[] arr,int low, int high){
        int count = 0;
        if(low < high){
            int mid  =  low + (high-low)/2;
    
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr,mid+1,high);
            count += merge(arr,low,mid,high);
    

        }
    
      
        return count;
    
      }
    
}