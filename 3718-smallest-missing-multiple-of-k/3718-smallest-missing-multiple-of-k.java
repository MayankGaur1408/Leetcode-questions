class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> arr= new HashSet<>();
        for(int n: nums){
            arr.add(n);
        }
        int res=k;
        while(arr.contains(res)){
            res+=k;
        }
        return res;
    }
}