import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(isCompositeNum(i)) answer++;
        }
        return answer;
    }
    public boolean isCompositeNum(int num){
        int cnt = 0;
        for(int i=1; i<=num; i++){
            if(num % i == 0) cnt++;
            if(cnt >= 3) return true;
        }
        return false;
    }
}