class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int l = p.length();
        for(int i = 0; i <= t.length()-l; ++i) {
            String temp = t.substring(i, i+l);
            if(Long.parseLong(p) >= Long.parseLong(temp))
                answer++;
        }
        // StringBuilder sb = new StringBuilder();
//         String[] str = t.split("");
//         for(int i = 0; i <= t.length()-l; ++i) {
//             for(int j = i; j < i+l; ++j) {
//                 sb.append(str[j]);
//             }

//             if(Integer.parseInt(p) >= Integer.parseInt(sb.toString())) {
//                 answer++;
//             }
//             sb.setLength(0);
//         }
        
        return answer;
    }
}