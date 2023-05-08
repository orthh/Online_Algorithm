import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(String item : arr){
            sb.append(item);
        }
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}