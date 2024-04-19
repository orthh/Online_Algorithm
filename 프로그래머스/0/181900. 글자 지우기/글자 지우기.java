import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i=0; i<indices.length; i++){
            arr[indices[i]] = "#";
        }
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals("#")){
                list.remove(i);
                i--;
            }
        }
        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }
        // for(int i=0; i<arr.length; i++){
        //     answer += arr[i];
        // }
        
        return answer;
    }
}