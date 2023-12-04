import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 현재 가지고 있는 학생 수 -> 전체 학생수 - 잃어버린 학생 수
        answer = n - lost.length;
        // 여벌 체육복을 가져온 학생이 도난당한 경우의수
        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if(reserve[i] == lost[j]){
                    reserve[i] = -5;
                    lost[j] = -10;
                    answer++;
                }
            }
        }
        
        // 여분을 가진 학생 -> 좌,우로 1개 대여 가능 -> 좌 먼저 빌려줘야 최대 가능
        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if((reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j]) && answer < n){
                    reserve[i] = -5;
                    lost[j] = -0;
                    answer++;
                }
            }  
        }
        return answer;
    }
}