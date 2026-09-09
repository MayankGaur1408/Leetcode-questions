class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int [] nums2=new int[n];
        for(int i=0;i<=nums1.length-1;i++){
            for(int j=i+1;j<=nums1.length-1;j++){
                if(i%2!=0){
                    nums2[i]=nums1[i]-nums1[j];
                }
                else{
                    nums2[i]=nums1[i];
                }
            }
        }
        for(int m=0;m<=nums2.length-1;m++){
            if(nums2[m]%2==0 || nums2[m]%3==0){
                return true;
            }
        }
        return false;

    }
}