class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] temp = phone_number.split("");
        answer += "*".repeat(temp.length - 4);
        for(int i=temp.length - 4; i<temp.length; i++) {
        	answer += temp[i];
        }
        
        return answer;
    }
}