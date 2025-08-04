class RemoveDuplicates {
    static int removeDupe(int[] arr){
        int i = 1;
        int j = 0;
        for(;i<arr.length;i++){
            if(arr[i]!= arr[j]){
                j++;
                arr[j]=arr[i];
            }

        }
        return j+1 ;
    }
    public static void main(String[] args) {
       int[] arr = {3,4,5,5,5,7,8,8,9} ;
        int newLength = (removeDupe(arr));

        for(int i=0;i<newLength;i++){
            System.out.print(arr[i]+" ");

        }
    }
}