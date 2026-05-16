class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int countZero = 0;
        int start = 0;
        int maxCount = 0;
        
        for(int end = 0; end < arr.length; end++){
            if(arr[end] == 0){
                countZero++;
            }
            
            while(countZero > k){
                if(arr[start] == 0){
                    countZero--;
                }
                start++;
            }
            maxCount = Math.max(maxCount, end-start+1);
        }
        return maxCount;
    }
}