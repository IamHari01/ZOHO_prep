class MissingIn_N_numbers {
    public static int missingIn_N_numbers(int[] arr, int n){
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0;i<n-1;i++){
            xor1 ^= arr[i];
            xor2 ^= i+1; //because the last number of the n is remaining so individually we xor with the n; 

        }
        xor2 ^= n;
        
        return xor1 ^ xor2 ;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Missing number is 3
        int n = 5;

        System.out.println("Missing number is: " + missingIn_N_numbers(arr, n));
    }
    }
