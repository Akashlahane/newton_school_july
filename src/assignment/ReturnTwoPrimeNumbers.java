package assignment;

import java.util.Scanner;

public class ReturnTwoPrimeNumbers {

    static boolean[] sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true. A value in
        // prime[i] will finally be false if i is Not a
        // prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        prime[0]= false;
        prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        return prime;
    }

    static void solve(boolean[] primes, int n){
        for(int i=2; i<primes.length;i++){
            if(primes[i]){
                if(primes[n-i]){
                    System.out.println(i+" "+(n-i));
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean[] primes = sieveOfEratosthenes(100000);

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            solve(primes, n);
        }
    }
}
