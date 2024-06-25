class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int scoreIdx = -1;
        
        for(int i = 0; i < dartResult.length(); ++i) {
            char ch = dartResult.charAt(i);
            
            if(Character.isDigit(ch)) {
                scoreIdx++;
                
                if(ch == '1' && dartResult.charAt(i+1) == '0') {
                    scores[scoreIdx] = 10;
                    i++;
                } else {
                    scores[scoreIdx] = ch - '0';
                }
            } else if(ch == 'S') {
                scores[scoreIdx] = (int) Math.pow(scores[scoreIdx], 1);
            } else if(ch == 'D') {
                scores[scoreIdx] = (int) Math.pow(scores[scoreIdx], 2);
            } else if(ch == 'T') {
                scores[scoreIdx] = (int) Math.pow(scores[scoreIdx], 3);
            } else if(ch == '*') {
                scores[scoreIdx] *= 2;
                if(scoreIdx > 0) {
                    scores[scoreIdx - 1] *= 2;
                }
            } else if(ch == '#') {
                scores[scoreIdx] *= -1;
            }
        }
        
        for(int score: scores) {
            answer += score;
        }
        
        return answer;
    }
}