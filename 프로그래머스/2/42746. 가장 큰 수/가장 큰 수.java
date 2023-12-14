import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<Integer> numList = new ArrayList<>();
        for(int num: numbers){
            numList.add(num);
        }
        // 각 자리의 앞자리가 큰 순서대로 정렬후 합치기
        // 예외 : 각 자리의 앞자리가 같은경우 다음 수까지 계산
        Collections.sort(numList, new Comparator<Integer>(){
            @Override
            public int compare(Integer i1, Integer i2){
                // 양수를 반환하면 비교된 두 수를 바꾼다.
                // 음수를 반환하면 비교된 두 수를 바꾸지 않는다.
                String numStr1 = Integer.toString(i1);
                String numStr2 = Integer.toString(i2);
                
                String order1 = numStr1 + numStr2;
                String order2 = numStr2 + numStr1;
                
                return Integer.parseInt(order2) 
                    - Integer.parseInt(order1);                               
            }
        });
        
        // 문자열로 변환
        for(int num: numList){
            answer += num;
        }
        
        // 모든 숫자가 0인 경우 예외 처리
        if (answer.charAt(0) == '0') {
            return "0"; 
        }
        
        return answer;
    }
}