import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // 알고리즘 : A 가장 작은값과 B 가장 큰값을 곱해 더하는게 최소의 수
        // A,B배열이 저장될 큐
        Queue<Integer> queueA = new LinkedList<>();
        Stack<Integer> stackB = new Stack<>();
        // A 오름차순 정렬 후 큐에 저장
        Arrays.sort(A);
        for(int num: A){
            queueA.offer(num);
        }
        // B 내림차순 정렬 후 큐에 저장
        // Integer[] B2 = Arrays.stream(B).boxed().toArray(Integer[]::new);
        // Arrays.sort(B2, (i1, i2) -> i2 - i1);
        // for(int num: B2){
        //     queueB.offer(num);
        // }
        Arrays.sort(B);
        for(int num: B){
            stackB.push(num);
        }
        // 큐를 순회하며 결과값 저장
        int size = queueA.size();
        for(int i=0; i<size; i++){
            answer += queueA.poll() * stackB.pop();
        }
        return answer;
    }
}