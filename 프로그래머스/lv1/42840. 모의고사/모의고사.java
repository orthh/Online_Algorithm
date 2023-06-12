import java.util.*;
class Solution {
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
    public int[] solution(int[] answers) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        int[] s = new int[3];
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a1[i % a1.length]) s[0]++;
            if(answers[i] == a2[i % a2.length]) s[1]++;
            if(answers[i] == a3[i % a3.length]) s[2]++;
        }
        int[] answer = new int[3];
        int max = Math.max(Math.max(s[0],s[1]),s[2]);
        for(int i=0; i<s.length; i++){
            if(max == s[i]) answer[i] = i + 1;
        }
        answer = removeElement(answer, 0);
        return answer;
    }
}