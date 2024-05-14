class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        char[] charS = s.toCharArray();
        if(charS.length == 4 || charS.length == 6)
            answer = true;
        
        for(char c: charS) {
            if(!Character.isDigit(c))
                answer = false;
        }
        
        return answer;
    }
}