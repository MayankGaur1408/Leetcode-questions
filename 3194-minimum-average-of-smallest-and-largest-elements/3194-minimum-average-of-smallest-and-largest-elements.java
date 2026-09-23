class Solution {
    public double minimumAverage(int[] nums) {
       int n = nums.length;
        double minAvg = Double.MAX_VALUE;
        for (int i = 0; i < n / 2; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minIndex = -1;
            int maxIndex = -1;
            for (int j = 0; j < n; j++) {
                if (nums[j] != -1 && nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
                if (nums[j] != -1 && nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }
            double avg = (min + max) / 2.0;
            if (avg < minAvg) {
                minAvg = avg;
            }
            nums[minIndex] = -1;
            nums[maxIndex] = -1;
        }
        return minAvg;
    }
}