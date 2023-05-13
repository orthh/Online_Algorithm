import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        long temp = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            temp += d[i];
            answer++;
            if(budget < temp){
                answer--;
                break;
            }
        }
        return answer;
    }
}