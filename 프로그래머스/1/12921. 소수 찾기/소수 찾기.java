class Solution {
    
    public int isPrimeFunc(int num) {
        boolean[] isPrime = new boolean[num+1];
        for(int i = 0; i < isPrime.length; ++i) {
            isPrime[i] = true;
        }
        
        isPrime[0] = isPrime[1] = false;
        
        for(int i = 2; i < Math.sqrt(num); ++i) {
            if(isPrime[i]) {
                for(int j = i*2; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int cnt = 0;
        for(int i = 0; i <= num; ++i) {
            if(isPrime[i]) {
                cnt++;
            }
        }
        return cnt;
    }
    
    public int solution(int n) {

        return isPrimeFunc(n);
    }
}