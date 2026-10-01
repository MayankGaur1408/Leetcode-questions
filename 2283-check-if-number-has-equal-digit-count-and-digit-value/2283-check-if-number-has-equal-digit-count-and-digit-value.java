class Solution {
    public boolean digitCount(String num) {
           for(int i=0;i<num.length();i++){
            int count=0;
            for(int j=0;j<num.length();j++)
            {
                int digit=num.charAt(j)-'0';
                if(digit==i)
                {
                    count++;
                }
            }
        int result=num.charAt(i)-'0';
            if(count!=result)
            {
                return false;
            }
        }
        return true;
    }
}