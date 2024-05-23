import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        List<Integer> cntList = new ArrayList<>();
        
        for(String[] clothe: clothes) {
            set.add(clothe[1]);
        }
        
        for(String elem: set) {
            for(String[] clothe: clothes) {
                if(elem.equals(clothe[1])) {
                    list.add(clothe[0]);
                }
            }
            cntList.add(list.size());
            list.clear();
        }
        
        for(int num: cntList) {
            answer *= (num+1);
        }
        
        return answer - 1;
    }
}