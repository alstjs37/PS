class Solution {
    public boolean isPrime(int n) {
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(n); ++i) {
            if(n%i == 0) {
                cnt++;
            }
        }
        if(Math.sqrt(n) % 1 == 0) {
            cnt = cnt*2 - 1;
        } else cnt *= 2;
        
        if(cnt == 2) return true;
        else return false;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length-2; ++i) {
            for(int j = i+1; j < nums.length-1; ++j) {
                for(int k = j+1; k < nums.length; ++k) {
                    int temp = nums[i] + nums[j] + nums[k];
                    
                    if(isPrime(temp)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}