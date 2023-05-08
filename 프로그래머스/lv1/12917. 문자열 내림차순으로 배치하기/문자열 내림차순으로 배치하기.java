import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] strArr = s.split("");
        int[] arr = new int[strArr.length];
        for(int i=0; i<arr.length; i++) {
        	arr[i] = ((int)strArr[i].charAt(0));
        }
        Arrays.sort(arr);
        for(int item : arr) {
        	sb.append((char)item);
        }
        sb.reverse();
        answer = sb.toString();
        return answer;
    }
}