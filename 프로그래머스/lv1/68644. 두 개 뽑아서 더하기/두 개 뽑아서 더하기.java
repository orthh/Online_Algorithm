import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(isDuplicate(arr, sum)){
                    continue;
                }else{
                    arr.add(sum);
                }
            }
        }
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    public boolean isDuplicate(ArrayList<Integer> arr, int num){
        boolean result = false;
        for(int item : arr){
            if(item == num) return true;
        }
        return result;
    }
}