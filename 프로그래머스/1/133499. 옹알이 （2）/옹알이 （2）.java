class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(String babble: babbling) {
            for(String word: words) {
                if(babble.contains(word.repeat(2))) {
                    continue;
                }
                babble = babble.replace(word, " ");
            }
            babble = babble.replace(" ", "");
            if(babble.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}