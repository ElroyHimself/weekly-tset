/*
 * @Date: 2022-10-10 08:54:10
 * @LastEditors: ELROY
 * @LastEditTime: 2022-10-10 08:55:16
 * @FilePath: /weekly-test-314/2.java
 */
class Solution {
    public int[] findArray(int[] pref) {
        if (pref.length == 1)
            return pref;
        int pre = pref[0];
        int cnt = pref[0];
        int[] res = new int[pref.length];
        res[0] = pre;
        for (int i = 1; i < pref.length; i++) {
            res[i] = pref[i] ^ cnt;
            cnt ^= res[i];
        }
        return res;
    }
}
