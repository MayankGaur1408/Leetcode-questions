class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int n=nums.length;
        if(n==1){
            return 0;
        }
        for(int i=1;i<n;i++){
            while(nums[i]<=nums[i-1]){
                nums[i]=nums[i]+1;
                count++;
            }
        }
        return count;
    }
}