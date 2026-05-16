class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int result = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int a: arr){
            prefixSum += a;
            if(map.containsKey(prefixSum-k)){
                result += map.get(prefixSum-k);
            }
            map.put(prefixSum, (map.getOrDefault(prefixSum, 0)+1));
        }
        return result;
    }
}