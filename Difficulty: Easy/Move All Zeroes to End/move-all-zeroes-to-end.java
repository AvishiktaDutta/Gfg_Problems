class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int var = 0; 
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[var] = arr[i];
                var++;
            }
        }
        for(int i = var; i<arr.length; i++){
            arr[i] = 0;
        }
    }
}