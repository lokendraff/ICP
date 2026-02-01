# Leetcode 1696 : Jump Game VI

[Link] (https://leetcode.com/problems/jump-game-vi/submissions/1904589531/)

## code
```java
class Solution {
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(0);
        
        for (int i = 1; i < n; i++) {
            if (dq.peekFirst() < i - k) {
                dq.pollFirst();
            }
            
            dp[i] = nums[i] + dp[dq.peekFirst()];
            while (!dq.isEmpty() && dp[dq.peekLast()] <= dp[i]) {
                dq.pollLast();
            }
            
            dq.offerLast(i);
        }
        
        return dp[n-1];
    }
}
