problem : 1665B - Array Cloning Technique

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> freqMap = new HashMap<>();
            int maxFreq = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                freqMap.put(a, freqMap.getOrDefault(a, 0) + 1);
                maxFreq = Math.max(maxFreq, freqMap.get(a));
            }

            if (maxFreq == n) {
                System.out.println(0);
                continue;
            }

            int ans = 0;
            int currentFreq = maxFreq;

            while (currentFreq < n) {
                ans++;
                
                int canAdd = Math.min(n - currentFreq, currentFreq);
                ans += canAdd;
                currentFreq += canAdd;
            }

            System.out.println(ans);
        }
    }
}
