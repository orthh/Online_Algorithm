import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        LinkedHashSet<Integer> lsh = 
        		  new LinkedHashSet();
        for(int item : nums) {
        	lsh.add(item);
        }
        if(nums.length / 2 <= lsh.size()) {
        	answer = nums.length / 2;
        }else {
        	answer = lsh.size();
        }
        return answer;
    }
}