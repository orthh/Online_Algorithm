import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
        int remain = stages.length;
        
        for (int i = 1; i <= N; i++) {
            int temp = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    temp++;
                }
            }
            if (remain == 0) {
                hm.put(i, 0.0);
            } else {
                hm.put(i, (double) temp / remain);
            }
            remain -= temp;
        }

        // 정렬
        LinkedHashMap<Integer, Double> sortedMap = hm.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
                .collect(
                        LinkedHashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        LinkedHashMap::putAll
                );

        int idx = 0;
        for (Map.Entry<Integer, Double> entry : sortedMap.entrySet()) {
            answer[idx++] = entry.getKey();
        }

        return answer;
    }
}