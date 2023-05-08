import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        ArrayList<Integer> al = new ArrayList<>();
        int minIndex = 0;
        for(int i=0; i<arr.length; i++) {
        	al.add(arr[i]);
        	if( arr[minIndex] > arr[i]) {
        		minIndex = i;
        	}
        }
        
        if(al.size() == 1) {
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	al.remove(minIndex);
        	answer = new int[al.size()];
        	for(int i=0; i<al.size(); i++) {
        		answer[i] = al.get(i);
        	}
        }
        return answer;
    }
}