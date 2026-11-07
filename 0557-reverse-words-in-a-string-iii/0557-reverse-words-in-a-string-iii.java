class Solution {
    public String reverseWords(String s) {
        String [] words=s.split(" ");
        String ans="";
        for(int i=0;i<words.length;i++){
           StringBuilder sb =new StringBuilder(words[i]);
           ans+=sb.reverse().toString();

           if(i<words.length-1){
            ans+=" ";
           }
        }
          return ans;
    }
}