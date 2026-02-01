# Leetcode 1823 : Find the Winner of the Circular Game

## Code

### Approach 1)
```java

class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> friends = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            friends.add(i);
        }

        int currIndex = 0;
        while (friends.size() > 1) {
            int removeIndex = (currIndex + k - 1) % friends.size();
            
            friends.remove(removeIndex); 
            currIndex = removeIndex;     
        }

        return friends.get(0);
    }
}
```

### Approach 2)
```java
class Solution {
    public int findTheWinner(int n, int k) {
        int winner = 0;
        for(int i=2; i<=n; i++){
            winner = (winner+k)%i;
        }

        return winner+1;
    }
}
