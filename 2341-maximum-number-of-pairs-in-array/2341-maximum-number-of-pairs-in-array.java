class Solution {
    public int[] numberOfPairs(int[] nums) {
        int arr[]=new int[101];
        for(int a:nums){
            arr[a]++;
        }
        int dupe=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                count+=arr[i]%2;
                dupe+=arr[i]/2;
            }
           
        }
         return new int[]{dupe,count};
    }
}