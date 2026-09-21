class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;
        int digit=0;
        for(int i=0;i<nums.length;i++){
            elementSum=elementSum+nums[i];
              while(nums[i]>0){
                digit=nums[i]%10;
                digitSum=digitSum+digit;
                nums[i]=nums[i]/10;
              }
        }
        return Math.abs(elementSum-digitSum);
    }
}