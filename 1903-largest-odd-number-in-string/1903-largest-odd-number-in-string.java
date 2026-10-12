class Solution {
    public String largestOddNumber(String num) {
        String result="";
        int n=num.length()-1;
        for(int i=n;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                for(int j=0;j<=i;j++){
                    result+=num.charAt(j);
                }
                return result;
            }
        }
        return "";
    }
}