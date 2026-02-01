# Leetcode 950 : Reveal Cards In Increasing Order

[Link] (https://leetcode.com/problems/reveal-cards-in-increasing-order/submissions/1904574415/)

## code

# Approach 1
```java

class Solution {
    public int[] deckRevealedIncreasing(int[] nums) {
        int n = nums.length;
        boolean skip=false;
        int i=0, j=0;
        int res[] = new int[n];
        Arrays.sort(nums);
        while(i<n){
            if(res[j]==0){
                if(!skip){
                    res[j]=nums[i];
                    i++;
                }
                skip = !skip;
            }

            j = (j+1)%n;
        }

        return res;
    }
}
