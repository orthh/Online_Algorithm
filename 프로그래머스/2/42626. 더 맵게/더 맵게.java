import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 우선순위 큐
        // 기본형 : 우선순위가 낮은 숫자가 먼저 나옴(작은 숫자)
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        // 우선순위 큐에 각 스코빌지수 추가
        for(int value: scoville){
            pQ.add(value);
        }
        
        int min = pQ.peek();
        // 가장 작은 값이 K 보다 작을동안 반복
        while(min < K){
            if(pQ.size() >= 2){
                pQ.add(pQ.poll() + (pQ.poll() * 2));
                // 최소값 재할당
                min = pQ.peek();
                answer++;
            }else{ // 우선순위큐의 크기가 2보다 작을경우 만들수 없음.
                return -1;
            }
        }
        return answer;
    }
}