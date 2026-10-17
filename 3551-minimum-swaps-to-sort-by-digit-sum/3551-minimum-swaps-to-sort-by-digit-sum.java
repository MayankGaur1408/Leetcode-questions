class Solution {
    public int minSwaps(int[] nums) {
             int n = nums.length;
        int[] sum = new int[n];
        Integer[] idx = new Integer[n];

        for (int i = 0; i < n; i++) {
            int num = nums[i];

            while (num > 0) {
                sum[i] += num % 10;
                num /= 10;
            }

            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> {
            if (sum[a] != sum[b]) {
                return Integer.compare(sum[a], sum[b]);
            }
            return Integer.compare(nums[a], nums[b]);
        });

        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || idx[i] == i) {
                continue;
            }

            int j = i;
            int cycle = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = idx[j];
                cycle++;
            }

            count += cycle - 1;
        }

        return count;
    }
}