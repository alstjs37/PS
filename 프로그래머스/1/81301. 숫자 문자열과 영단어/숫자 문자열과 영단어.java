import java.util.*;
class Solution {
    public int solution(String s) {
        
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i) {
            map.put(nums[i], String.valueOf(i));
        }
        
        for(String key: map.keySet()) {
            s = s.replace(key, map.get(key));
        }
        
        return Integer.parseInt(s);
    }
}