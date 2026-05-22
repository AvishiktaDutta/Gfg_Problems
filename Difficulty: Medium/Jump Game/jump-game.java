// User function Template for Java

class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        // code here
        int finalPosition = arr.length-1;

        for(int i = arr.length-2; i >= 0; i--){
            if(i + arr[i] >= finalPosition){
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }
}