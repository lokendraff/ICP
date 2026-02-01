# Leetcode 3589 : Count Prime-Gap Balanced Subarrays

[Link] (https://leetcode.com/problems/count-prime-gap-balanced-subarrays/submissions/1899532621/)


## code

### Approach 1)
```java
class Solution {
    public int primeSubarray(int[] nums, int k) {
        int ans=0, n=nums.length;
        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int max = 0, C=0;
            for(int j=i; j<n; j++){
                if(isPrime(nums[j])){
                    min = Math.min(min, nums[j]);
                    max = Math.max(max, nums[j]);
                    C++;
                }

                if(C>=2 && max-min<=k){
                    ans++;
                }
            }
        }

        return ans;
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
