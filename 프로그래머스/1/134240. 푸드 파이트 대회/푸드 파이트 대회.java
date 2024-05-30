class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        for(int i = 1; i < food.length; ++i) {
            sb.append(String.valueOf(i).repeat(food[i]/2));
        }
        
        answer.append(sb);
        answer.append(0);
        answer.append(sb.reverse());
        
        return answer.toString();
    }
}