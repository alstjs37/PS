class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [arr1.length];
        int maxLen = 0;
        
        for(int i = 0; i < arr1.length; ++i) {
            
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(temp.length() > maxLen) {
                maxLen = temp.length();
            }
            
            answer[i] = temp;
        }
        
        for(int i = 0; i < answer.length; ++i) {
            if(answer[i].length() != maxLen) {
                answer[i] = "0".repeat(maxLen - answer[i].length()) + answer[i];
            }
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }
        
        return answer;
    }
}