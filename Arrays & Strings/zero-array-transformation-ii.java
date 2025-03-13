class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] D = new int[n + 1]; 
        int k = 0;

        boolean allZero = true;
        for (int num : nums) {
            if (num > 0) {
                allZero = false;
                break;
            }
        }
        if (allZero) return 0;

        for (int[] q : queries) {
            k++;
            int l = q[0], r = q[1], x = q[2];

            D[l] -= x;
            D[r + 1] += x;

            int delta = 0;
            boolean allNonPositive = true;
            for (int i = 0; i < n; i++) {
                delta += D[i];
                if (nums[i] + delta > 0) {
                    allNonPositive = false;
                    break;
                }
            }

            if (allNonPositive) return k;
        }

        return -1;
    }
}
