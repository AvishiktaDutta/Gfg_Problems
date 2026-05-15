class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currSum = arr[0];
        int maxSum = arr[0];
        
        for(int i = 1; i<arr.length; i++){
            currSum = Math.max(arr[i], arr[i]+currSum);
            maxSum = Math.max(currSum, maxSum);
            
        }
        return maxSum;
    }
}
