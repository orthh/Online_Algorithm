import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Stack<String> s_c1 = new Stack();
        Stack<String> s_c2 = new Stack();
        for(int i=cards1.length - 1; i>=0; i--) s_c1.push(cards1[i]);
        for(int i=cards2.length - 1; i>=0; i--) s_c2.push(cards2[i]);
        for(int i=0; i<goal.length; i++){
            if(!s_c1.empty()){
                if(s_c1.peek().equals(goal[i])){
                s_c1.pop();
                continue;
                }
            }
            if(!s_c2.empty()){
                if( s_c2.peek().equals(goal[i])){
                s_c2.pop();
                continue;
                }
            }
            return "No";
        }
        
        return "Yes";
    }
}