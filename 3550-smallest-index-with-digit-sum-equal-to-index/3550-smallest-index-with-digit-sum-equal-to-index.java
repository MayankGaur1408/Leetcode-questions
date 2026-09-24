class Solution {
    public int smallestIndex(int[] nums) {
        int digit=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                digit=nums[i]%10;
                sum=sum+digit;
                nums[i]=nums[i]/10;
            }
            if(sum==i){
                return sum;
            }
        }
        return -1;
    }
}