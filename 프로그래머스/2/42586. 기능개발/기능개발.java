import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        // 일자, 포인터
        int days = 0;
        int pointer = 0;
        // 큐에 속도 저장
        for(int speed: speeds){
            queue.add(speed);
        }
        // 작업개수 저장
        int num = 0;
        // 첫번째 작업
        int speed = queue.poll();
        while(progresses[0] < 100){
            progresses[0] += speeds[0];
            days++;
        }
        pointer++;
        num++;
        // 큐가 빌 때까지 반복
        while(queue.peek() != null){
            speed = queue.poll();
            if(progresses[pointer] + speed * days >= 100){
              num++;
              pointer++;
            }else{
                answer.add(num);
                num = 0;
                progresses[pointer] += speeds[pointer] * days;
                while(progresses[pointer] < 100){
                    progresses[pointer] += speeds[pointer];
                    days++;
                }
                num++;
                pointer++;
            }
        }
        answer.add(num);
        
        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}