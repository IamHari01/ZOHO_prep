
class SecondMax {

    static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                s_max = max;
                max = arr[i];

            }else if (arr[i] > s_max && arr[i]!=max ) {
                s_max = arr[i];
            }

        } 

        return s_max;

    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 4, 10, 4, 9};
        int result = secondMax(arr);
        System.out.println(result);
    }

}
