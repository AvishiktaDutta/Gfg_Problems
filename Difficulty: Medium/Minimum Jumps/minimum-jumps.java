class Solution {
    public int minJumps(int[] arr) {
        // code here
        int totalJumps = 0;
        int destination = arr.length-1;
        int coverage = 0, lastJump = 0;
    
        if(arr.length <= 1){
            return 0;
        }
        if (arr[0] == 0) {
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            coverage = Math.max(coverage, i+arr[i]);
            if (i == coverage) {
                return -1;
            }
    
            if(i == lastJump){
                lastJump = coverage;
                totalJumps++;
    
                 if(coverage>=destination){
                   return totalJumps;
                }
            }
        }
    return -1;
    }
}