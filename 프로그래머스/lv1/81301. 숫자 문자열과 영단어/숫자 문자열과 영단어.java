import java.util.*;
class Solution {
    public int solution(String s) {
        String[] key = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int answer = 0;
        for(int i=0; i<key.length; i++){
            s = s.replaceAll(key[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
    

}