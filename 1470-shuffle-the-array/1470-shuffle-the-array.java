class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr=new int[2*n];
        int k=0;
        for(int i=0;i<n;i++){
            arr[k++]=nums[i];
            arr[k++]=nums[i+n];
        }
        return arr;
    }
}