class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time=0;
        int curr=0;
        for(int i=0;i<requests.length;i++){
            time+=Math.abs(requests[i]-curr);
            curr=requests[i];
        }
        return time;
    }
}