import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 해시맵에 participant 담기 (이름, 카운트)
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0; i<participant.length; i++){
            // getOrDefault : participant[i] 가 있으면 그 값, 없으면 0 
            hm.put(participant[i], hm.getOrDefault(participant[i], 0) + 1);
        }
        // completion 순회하며 해당하는 참가자의 값 -1 씩 하기
        for(int i=0; i<completion.length; i++){
            hm.put(completion[i], hm.get(completion[i]) - 1);
        }
        // 값이 1인 참가자 찾기 -> 답
        Iterator<Map.Entry<String,Integer>> entry = hm.entrySet().iterator();
        while(entry.hasNext()){
            Map.Entry<String, Integer> element = entry.next();
            if(element.getValue() == 1){
                answer = element.getKey();
                break;
            }
        }
        
        
        return answer;
    }
}