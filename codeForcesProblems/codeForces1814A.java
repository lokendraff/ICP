Problem : A. Coins

  import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return; 
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            long n = sc.nextLong(); 
            long k = sc.nextLong();
 
           if (n % 2 == 0 || (n >= k && (n - k) % 2 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
