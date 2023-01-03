class Solution {
    public int[] twoSum(int[] A, int x) {
        int[] ans = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<A.length;i++) {
            if(mp.getOrDefault(x - A[i],0) != 0) {
                ans[0] = i;
                ans[1] = mp.get(x - A[i]) - 1;
                return ans;
            }
            mp.put(A[i],i+1);
        }
        return ans;
    }
}
