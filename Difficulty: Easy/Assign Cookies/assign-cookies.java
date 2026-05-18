class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        // code here
         Arrays.sort(greed);
        Arrays.sort(cookie);

        int cookiePointer = 0;
        int childPointer = 0;

        while(childPointer < greed.length && cookiePointer < cookie.length){
            if(cookie[cookiePointer] >= greed[childPointer]){
                childPointer++;
            }
            cookiePointer++;
        }
        return childPointer;
    }
}