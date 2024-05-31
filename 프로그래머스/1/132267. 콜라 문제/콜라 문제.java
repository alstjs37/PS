class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            int get = n / a;
            answer += get * b;
            
            int remain = n % a;
            n = get*b + remain;
        }
        
        return answer;
    }
}