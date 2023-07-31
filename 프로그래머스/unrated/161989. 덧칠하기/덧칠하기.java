import java.util.stream.IntStream;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int len = section.length;
        int idx = 0;

        while (idx < len) {
            int temp = section[idx];
            idx++;

            idx = (int) IntStream.range(idx, len)
                    .filter(i -> section[i] >= temp + m)
                    .findFirst()
                    .orElse(len);
            answer++;
        }

        return answer;
    }
}