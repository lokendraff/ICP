# Leetcode 950 : Reveal Cards In Increasing Order

[Link] (https://leetcode.com/problems/reveal-cards-in-increasing-order/submissions/1904574415/)

## code

### Approach 1
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
```

### Approach 2
```java
class Solution {
    public int[] deckRevealedIncreasing(int[] nums) {
        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        int res[] = new int[n];
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            dq.addLast(i);
        }
        int idx=0;
        while(!dq.isEmpty()){
            int ce = dq.pollFirst();
            if(dq.size()>1){
                int li = dq.pollFirst();
                dq.addLast(li);
            }
            res[ce]= nums[idx++];
        }

        return res;
    }
}
