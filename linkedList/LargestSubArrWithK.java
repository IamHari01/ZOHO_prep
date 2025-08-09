class LargestSubArrWithK {
    public int largestSubArrWithK(int[] nums, int k) {
        //sliding window:
        int n = nums.length;
        int left = 0;
        long sum = 0;
        int maxLen = 0;
        
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            
            // When sum exceeds K, move left pointer
            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }
            
            // Update maxLen when sum equals K
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        
    }
}