class Solution {
    public double minimumAverage(int[] nums) {
     Arrays.sort(nums);
     double avg=0;
     int left=0;
     int right=nums.length-1;
     double min=Double.MAX_VALUE;
     while(left<=right){
        avg=(nums[left]+nums[right])/2.0;
        min=Math.min(min,avg);
        left++;
        right--;
     }
     return min;
    }
}