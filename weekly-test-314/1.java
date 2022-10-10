/*
 * @Date: 2022-10-10 08:54:02
 * @LastEditors: ELROY
 * @LastEditTime: 2022-10-10 08:54:02
 * @FilePath: /weekly-test-314/1.java
 */
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int ans = logs[0][0];
        int pre = logs[0][1];

        for (int i = 1; i < logs.length; i++) {
            if (logs[i][1] - logs[i - 1][1] > pre) {
                ans = logs[i][0];
                pre = logs[i][1] - logs[i - 1][1];
            } else if (logs[i][1] - logs[i - 1][1] == pre) {
                ans = Math.min(ans, logs[i][0]);
            }
        }
        return ans;
    }
}
