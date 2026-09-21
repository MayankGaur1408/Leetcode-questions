class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int overall=0;
        if((arrivalTime+delayedTime)<24){
            return arrivalTime+delayedTime;
        }
        if((arrivalTime+delayedTime)>=24 ){
             overall=Math.abs( 24-(arrivalTime+delayedTime));
        }
        return overall;
    }
}