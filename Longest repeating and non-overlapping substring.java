class Solution {
    static String longestSubstring(String s, int n) {
        if (n == 1)
            return "-1";

        String ans = "";
        int len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (j - i <= len)
                    continue;

                String a = s.substring(i, j);
                String b = s.substring(j, n);
                
                if (b.contains(a)) {
                    ans = a;
                    len = a.length();
                } else {
                    break;
                }
            }
        }
        return ans.length() == 0 ? "-1" : ans;
    }
}