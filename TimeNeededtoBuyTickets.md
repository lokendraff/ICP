# Leetcode 2073 : Time Needed to Buy Tickets

## Code

### Approach 1)
```java
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int c=0, t = tickets[k];
        tickets[k] = 101;
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0; i<tickets.length; i++){
            dq.addLast(tickets[i]);
        }

        while(true){
            if(!dq.isEmpty() && dq.peekFirst()==101){
                if(t==1){
                    c++;
                    break;
                }

                t--;
                int temp = dq.pollFirst();
                dq.addLast(temp);
            }

            else if(!dq.isEmpty() && dq.peekFirst()!=1){
                int temp = dq.pollFirst();
                dq.addLast(temp-1);
            }
            else{
                dq.pollFirst();
            }
            c++;
        }

        return c;
    }
}
```
### Approach 2)
```java
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length, time=0;
        for(int i=0; i<n; i++){
            if(i<=k){
                time += Math.min(tickets[i], tickets[k]);
            }else{
                time  += Math.min(tickets[i],tickets[k]-1);
            }
        }

        return time;
    }
}
```
