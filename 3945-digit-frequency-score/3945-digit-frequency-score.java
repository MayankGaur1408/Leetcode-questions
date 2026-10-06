class Solution {
    public int digitFrequencyScore(int n) {
        int [] count=new int[10];
        while(n>0){
            int digit=n%10;
            count[digit]++;
            n=n/10;
        }
        int score=0;
        for(int i=0;i<10;i++){
            score+=i*count[i];
        }
        return score;
    }
}